package model.accounts.accountBehavior;

import model.accounts.Account;
import model.accounts.SecuritiesAccount;

public class SecuritiesAccountInterestBehavior implements IntrestBehavior {
    SecuritiesAccount account;
    public SecuritiesAccountInterestBehavior(SecuritiesAccount account){
        this.account=account;
    }

    @Override
    public void interest() {

    }
}