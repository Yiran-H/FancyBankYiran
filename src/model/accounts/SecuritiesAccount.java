package model.accounts;

import data.AccountDao;
import data.TransactionDao;
import model.accounts.Account;
import model.accounts.accountBehavior.SecuritiesAccountInterestBehavior;
import model.currency.CurrencyType;
import model.currency.Money;
import model.stock.Stock;
import model.stock.StockList;
import model.transactions.Transaction;
import model.transactions.TransactionType;
import util.Factory;
import util.ID;

import model.currency.Currency;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SecuritiesAccount extends Account {
    private List<StockList> stockList;
    public SecuritiesAccount(ID userID, Currency currency, Money balance) {
        super(userID, currency, balance, AccountType.SECURITIES);

        interestBehavior=new SecuritiesAccountInterestBehavior(this);
        stockList = new ArrayList<>();
    }
    public boolean buyStock(ID userID, String name, int number) throws IOException {
        TransactionDao transactionDao = new TransactionDao();
        AccountDao accountDao = new AccountDao();
        Stock s = Factory.produceStock(name);
        if (s != null && getBalance().change2USD(getCurrency().getType()) < s.getPrice() * number) {
            StockList list = new StockList(userID, s, number);
            //add to user's stockList
            stockList.add(list);
            //add to user's stockList file
            accountDao.addStockList(list.toString(), userID.toString());
            //add a transaction
            transactionDao.save(new Transaction(userID, null, getId(), new Date(), s.getCurrency(), s.getPrice() * number, TransactionType.BUYSTOCK));
            return true;
        }
        return false;
    }
}
