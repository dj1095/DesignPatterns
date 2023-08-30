package object.oriented.design.examples.parkinglot;

import object.oriented.design.examples.parkinglot.enums.AccountStatus;
import object.oriented.design.examples.parkinglot.models.Person;

public abstract  class Account {
    protected String username;
    protected String password;
    protected AccountStatus accountStatus;

    protected Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }
}
