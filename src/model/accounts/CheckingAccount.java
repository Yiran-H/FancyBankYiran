package model.accounts;

import model.accounts.accountBehavior.CheckingAccountInterestBehavior;
import model.currency.Money;
import util.ID;

import model.currency.Currency;

public class CheckingAccount extends Account {


    public CheckingAccount(ID userID, Currency currency, Money balance) {
        super(userID, currency, balance, AccountType.CHECKING);
        interestBehavior=new CheckingAccountInterestBehavior(this);
    }
    public CheckingAccount(String id, ID userID, Currency currency, Money balance) {
        super(id, userID, currency, balance, AccountType.CHECKING);
    }
}
