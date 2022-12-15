package model.transactions;

import util.ID;

import model.currency.Currency;
import java.util.Date;

public class PayLoan extends Transaction{

    public PayLoan(ID userID, ID fromAccountID, ID toAccountID, Currency currency, double amount, TransactionType type) {
        super(userID, fromAccountID, toAccountID, currency, amount, TransactionType.PAYLOAN);
    }
}
