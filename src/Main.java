import model.users.Manager;
import model.users.User;
import service.CreateAccount;
import service.MakeTransactions;
import service.Register;
import service.SignIn;
import util.Reader;
import util.Writer;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws IOException {

//        Register register = new Register("Lily", "Yiran", "Huang", "123", "19991130" ,"123456");
//        User u = register.register();
        SignIn signIn = new SignIn("Lily", "123");
        User u = signIn.signIn();
        Manager m = new Manager("CPK", "C", "K", "123456", "19801111");
        CreateAccount createAccount = new CreateAccount(u, m);
//        createAccount.createCheckingA(200);
//        System.out.println(u.getChecking().getBalance().toString());

        MakeTransactions makeTransactions = new MakeTransactions(u, m);
//        makeTransactions.transfer(u.getSaving(), u.getChecking(), 1000);
//        makeTransactions.deposit(u.getSaving(), 5000.0);
//        makeTransactions.withdraw(u.getSaving(), 1000.0);
//        makeTransactions.payLoan(u.getLoan(), 2000);
//        createAccount.createLoanA(1000.0);
//        createAccount.createSecuritiesA(1500);
//        u.getSecurities().buyStock(u.getId(), "AMZN", 3);
        for (String s : u.getSecurities().print(Reader.L1)) {
            System.out.println(s);
        }
//        u.getSecurities().sellStock(u.getId().toString(), "PYPL", 1);
//        m.addNewStock("ABC", 10.0, "ABC");
//        m.updateStockPrice("PYPL", 90);
//        for (String s : Reader.L2) {
//            System.out.println(s);
//        }
        Map<String, String> map = m.getWhoOweMeMost();
        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println(e.getKey() + e.getValue());
        }
    }
}
