package model.transactions;

import model.currency.Currency;
import util.ID;

import java.util.Date;

public class StockSell extends Transaction{
    public StockSell(ID userID, ID fromAccountID, ID toAccountID, Date date, Currency currency, double amount, TransactionType type) {
        super(userID, fromAccountID, toAccountID, date, currency, amount, TransactionType.SELLSTOCK);
    }
}
