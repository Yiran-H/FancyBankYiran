package model.accounts;

import model.accounts.accountBehavior.IntrestBehavior;
import model.currency.Currency;
import model.currency.Money;
import util.ID;
import java.util.Date;

public class Account {
    private final ID id;
    private final ID userID;
    private final Currency currency;
    private Money balance;
    private Date date;
    private AccountType type;

    protected IntrestBehavior interestBehavior;


    public Account(ID userID, Currency currency, Money balance, AccountType type) {
        this.id = new ID();
        this.userID = userID;
        this.currency = currency;
        this.balance = balance;
        this.date = new Date();
        this.type = type;
    }

    public Account(String id, ID userID, Currency currency, Money balance, AccountType type) {
        this.id = new ID(id);
        this.userID = userID;
        this.currency = currency;
        this.balance = balance;
        this.type = type;
        this.date = new Date();
    }

    public void setBalance(Money balance) {
        this.balance = balance;
    }

    public AccountType getType() {
        return type;
    }

    public ID getId() {
        return id;
    }

    public ID getUserID() {
        return userID;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Money getBalance() {
        return balance;
    }

    public Date getDate() {
        return date;
    }
    public String toString() {
        return id + " " + userID + " " + currency.toString() + " " + balance.toString() + " " + date;
    }

    public void interest(){
        interestBehavior.interest();
    }
}
