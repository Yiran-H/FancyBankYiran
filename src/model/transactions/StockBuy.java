package model.transactions;

import model.currency.Currency;
import model.stock.Stock;
import model.stock.StockList;
import util.Factory;
import util.ID;

import java.util.Date;

public class StockBuy extends Transaction{

    public StockBuy(ID userID, ID fromAccountID, ID toAccountID, Date date, Currency currency, double amount, TransactionType type) {
        super(userID, fromAccountID, toAccountID, date, currency, amount, TransactionType.BUYSTOCK);
    }
}
