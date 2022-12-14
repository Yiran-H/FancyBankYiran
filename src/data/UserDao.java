package data;

import model.users.Customer;
import model.users.User;
import util.ID;
import util.Writer;

import java.io.IOException;

public class UserDao {
     public void save(User u) throws IOException {
         Writer.addLine(u.toString(), "src/data/user.txt");
     }
     public Customer getCustomerByID (ID id) {
        Customer c = null;
        return c;
    }
    public Customer getCustomerByName (String s) {
        Customer c = null;
        return c;
    }
}
