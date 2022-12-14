package model.users;

import model.accounts.*;
import util.ID;

public class User {
    private final ID id;
    private final String username;
    private final String firstName;
    private final String lastName;
    private final String password;
    private final String birth;
    private Account saving;
    private Account checking;
    private Account loan;
    private Account securities;

    public User(String id, String username, String firstName, String lastName, String password, String birth) {
        this.id = new ID(id);
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.birth = birth;
    }

    public User(String username, String firstName, String lastName, String password, String birth) {
        id = new ID();
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.birth = birth;
        this.saving = null;
        this.checking = null;
        this.loan = null;
        this.securities = null;
    }

    public Account getSaving() {
        return saving;
    }

    public Account getChecking() {
        return checking;
    }

    public Account getLoan() {
        return loan;
    }

    public Account getSecurities() {
        return securities;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getBirth() {
        return birth;
    }

    public void setSaving(Account saving) {
        this.saving = saving;
    }

    public void setChecking(Account checking) {
        this.checking = checking;
    }

    public void setLoan(Account loan) {
        this.loan = loan;
    }

    public void setSecurities(Account securities) {
        this.securities = securities;
    }

    public ID getId() {
        return id;
    }
    public String toString() {
        return id + " " + username + " " + firstName + " " + lastName + " " + password + " " + birth;
    }
    public void updateBalance(double offset) {

    }
}
