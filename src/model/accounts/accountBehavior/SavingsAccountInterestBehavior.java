package model.accounts.accountBehavior;

import model.accounts.Account;
import model.accounts.SavingsAccount;

public class SavingsAccountInterestBehavior implements IntrestBehavior{
    SavingsAccount account;
    public SavingsAccountInterestBehavior(SavingsAccount account){
        this.account=account;
    }

    @Override
    public void interest() {

    }
}