package model.accounts;

import model.accounts.accountBehavior.LoanAccountInterestBehavior;
import model.currency.Money;
import util.ID;
import model.currency.Currency;

public class LoanAccount extends Account{
    private Money paidLoan;
    private Money unpaidLoan;
    public LoanAccount(ID userID, Currency currency, Money balance) {
        super(userID, currency, balance, AccountType.LOAN);
        interestBehavior=new LoanAccountInterestBehavior(this);
        this.paidLoan = new Money(0);
        this.unpaidLoan = new Money(balance.getValue());
    }

    public Money getPaidLoan() {
        return paidLoan;
    }

    public void setPaidLoan(Money paidLoan) {
        this.paidLoan = paidLoan;
    }

    public Money getUnpaidLoan() {
        return unpaidLoan;
    }

    public void setUnpaidLoan(Money unpaidLoan) {
        this.unpaidLoan = unpaidLoan;
    }
    public String toString() {
        return super.toString() + " " + paidLoan.toString() + " " + unpaidLoan.toString();
    }
}
