package service;

import data.AccountDao;
import data.TransactionDao;
import model.accounts.Account;
import model.transactions.Deposit;
import model.transactions.Transaction;
import model.transactions.TransactionType;
import model.users.User;

import java.io.IOException;

public class MakeTransactions {
    private User user;
    private User manager;
    private AccountDao accountDao = new AccountDao();
    private TransactionDao transactionDao = new TransactionDao();
    public MakeTransactions(User user, User manager) {
        this.user = user;
        this.manager = manager;
    }
    public void deposit(Account a, double amount) throws IOException {
        Transaction deposit = new Deposit(user.getId(), null, a.getId(), a.getCurrency(), amount, TransactionType.DEPOSIT);
        transactionDao.save(deposit);
        a.getBalance().addMoney(amount);
        accountDao.save(a);
    }
}
