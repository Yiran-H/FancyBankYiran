package model.transactions;

import util.ID;

import model.currency.Currency;
import java.util.Date;

public class Deposit extends Transaction {

    public Deposit(ID userID, ID fromAccountID, ID toAccountID, Date date, Currency currency, double amount, TransactionType type) {
        super(userID, fromAccountID, toAccountID, date, currency, amount, TransactionType.DEPOSIT);
    }
}
