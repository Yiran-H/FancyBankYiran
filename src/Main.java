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
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws IOException {

//        Register register = new Register("Lily", "Yiran", "Huang", "123", "19991130" ,"123456");
//        User u = register.register();
        SignIn signIn = new SignIn("Lily", "123");
        User u = signIn.signIn();
        Manager m = new Manager("CPK", "C", "K", "123456", "19801111");
//        CreateAccount createAccount = new CreateAccount(u, m);
//        System.out.println(createAccount.createSavingA(200));
        System.out.println(u.getSaving().getBalance().toString());

//        MakeTransactions makeTransactions = new MakeTransactions(u, m);
//        makeTransactions.deposit(u.getSaving(), 300.0);
    }
}
