package service;

import data.AccountDao;
import model.accounts.Account;
import model.accounts.CheckingAccount;
import model.accounts.SavingsAccount;
import model.accounts.SecuritiesAccount;
import model.currency.Money;
import model.currency.USD;
import model.users.User;

import java.io.IOException;

public class CreateAccount {
    AccountDao accountDao = new AccountDao();
    private User user;
    public CreateAccount(User user) {
        this.user = user;
    }
    public boolean createSavingA(double startMoney) throws IOException {
        if (startMoney > 100.0) {
            Account a = new SavingsAccount(user.getId(), USD.getInstance(), new Money(startMoney));
            user.setSaving(a);
            accountDao.save(a);
            return true;
        }
        return false;
    }
    public boolean createCheckingA(double startMoney) throws IOException {
        Account a = new CheckingAccount(user.getId(), USD.getInstance(), new Money(startMoney));
        user.setChecking(a);
        accountDao.save(a);
        return true;
    }
    public boolean createSecuritiesA(double startMoney) {
        if (user.getSecurities() == null && startMoney >= 1000 && user.getSaving().getBalance().getValue() >= 5000 && user.getSaving().getBalance().getValue() - startMoney >= 2500) {
            user.setSecurities(new SecuritiesAccount(user.getId(), USD.getInstance(), new Money(startMoney)));
            accountDao.createStockListFile(user.getId().toString());
            return true;
        }
        return false;
    }
}
