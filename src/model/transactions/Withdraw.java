package model.transactions;

import util.ID;

import model.currency.Currency;
import java.util.Date;

public class Withdraw extends Transaction{

    public Withdraw(ID userID, ID fromAccountID, ID toAccountID, Date date, Currency currency, double amount, TransactionType type) {
        super(userID, fromAccountID, toAccountID, date, currency, amount, TransactionType.WITHDRAW);
    }
}
