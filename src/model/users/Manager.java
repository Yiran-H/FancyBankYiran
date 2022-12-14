package model.users;
import java.io.IOException;
import java.text.DecimalFormat;
import util.Reader;
import util.Writer;

public class Manager extends User{

    public Manager(String username, String firstName, String lastName, String password, String birth) {
        super(username, firstName, lastName, password, birth);
    }



    // return manager's balance in double
    public double getBalanceDouble() {
        return Reader.getManagerBalance();
    }

    // return manager's balance in String
    public String getBalanceString() {
        double balance = Reader.getManagerBalance();
        DecimalFormat df = new DecimalFormat("#,###");
        df.setMaximumFractionDigits(3);
        return df.format(balance);
    }

    // set manager's balance
    public void setBalance(double balance) {
        try {
            Writer.updateManagerBalance(balance);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // update manager's balance
    public void updateBalance(double offset) {
        try {
            Writer.updateManagerBalance(getBalanceDouble() + offset);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // add a new stock (name, price, company name) to the stock.txt
    public void addNewStock(String name, double Price, String companyName) {
        String newline = name+" "+Price+" "+companyName;
        try {
            Writer.addLine(newline, "src/data/stock.txt");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // update price for a stock in stock.txt
    public void updateStockPrice(String name, double newPrice) {
        try {
            Writer.updateStockPrice(name, newPrice, "src/data/stock.txt");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }



// public static void main(String[] args) throws IOException {
//  addNewStock("ADBE", 344.11, "Adobe");
//  updateStockPrice("PYPL", 73.44);
//  System.out.println(getBalanceString());
//  setBalance(10000000);
//  System.out.println(getBalanceString());
//  updateBalance(200);
//  System.out.println(getBalanceString());
// }
}
