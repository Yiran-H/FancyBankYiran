package model.accounts.accountBehavior;

import model.accounts.Account;
import model.accounts.LoanAccount;

public class LoanAccountInterestBehavior implements IntrestBehavior{
    LoanAccount account;
    public LoanAccountInterestBehavior(LoanAccount account){
        this.account=account;
    }

    @Override
    public void interest() {

    }
}