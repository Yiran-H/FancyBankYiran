package data;

import model.accounts.Account;
import util.ID;
import util.Writer;

import java.io.File;
import java.io.IOException;

public class AccountDao {
    public void save(Account a) throws IOException {
        switch (a.getType()) {
            case SECURITIES:
                Writer.addLine(a.toString(), "src/data/SecuritiesAccount.txt");
                break;
            case CHECKING:
                Writer.addLine(a.toString(), "src/data/CheckingAccount.txt");
                break;
            case SAVINGS:
                Writer.addLine(a.toString(), "src/data/SavingAccount.txt");
                break;
            case LOAN:
                Writer.addLine(a.toString(), "src/data/LoanAccount.txt");
                break;
        }
    }
    public void addStockList(String s, String pathName) throws IOException {
            Writer.addLine(s, "src/data/" + pathName + ".txt");
    }
    public void createStockListFile(String pathName) {
        File file = new File("src/data/" + pathName + ".txt");
        boolean result;
        try {
            result = file.createNewFile();
            if(result) {
                System.out.println("file created "+file.getCanonicalPath());
                String s = "id/userID/stockName/number/butDate/sellDate";
                Writer.addLine(s, "src/data/" + pathName + ".txt");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
