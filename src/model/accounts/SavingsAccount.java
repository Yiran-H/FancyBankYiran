package model.accounts;

import model.accounts.Account;
import model.accounts.accountBehavior.SavingsAccountInterestBehavior;
import model.currency.Money;
import util.ID;

import model.currency.Currency;

public class SavingsAccount extends Account {
    public SavingsAccount(ID userID, Currency currency, Money balance) {
        super(userID, currency, balance, AccountType.SAVINGS);
        interestBehavior=new SavingsAccountInterestBehavior(this);
    }
    public SavingsAccount(String id, ID userID, Currency currency, Money balance) {
        super(id, userID, currency, balance, AccountType.SAVINGS);
    }
}
