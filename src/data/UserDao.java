package data;

import model.users.Customer;
import model.users.User;
import util.ID;
import util.Reader;
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
        for (String ss : Reader.L1) {
            String[] sss = ss.split(" ", 0);
            if (sss[1].equals(s)) {
                return new Customer(sss[0], sss[1], sss[2], sss[3], sss[4], sss[5], sss[6]);
            }
        }
        return null;
    }
}
