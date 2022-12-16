package model.accounts;

import model.accounts.Account;
import model.accounts.accountBehavior.SavingsAccountInterestBehavior;
import model.currency.Money;
import model.currency.USD;
import util.ID;

import model.currency.Currency;
import util.Reader;

import java.util.ArrayList;
import java.util.List;

public class SavingsAccount extends Account {
    public SavingsAccount(ID userID, Currency currency, Money balance) {
        super(userID, currency, balance, AccountType.SAVINGS);
        interestBehavior=new SavingsAccountInterestBehavior(this);
    }
    public SavingsAccount(String id, ID userID, Currency currency, Money balance) {
        super(id, userID, currency, balance, AccountType.SAVINGS);
    }

    @Override
    public Money getBalance() {
        Money a = null;
        for (String s : Reader.L5) {
            String[] ss = s.split(" ", 0);
            if (ss[0].equals(getId().toString())) {
                a = new Money(Double.parseDouble(ss[3]));
                setBalance(a);
            }
        }
        return a;
    }

    //date diffMoney afterMoney
    @Override
    public List<String> print(List<String> input) {
        return super.print(Reader.L5);
    }
}
