package model.entities;

import model.exceptions.AccountException;

public class Account {
    private final Integer number;
    private final String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer number() {
        return number;
    }

    public String holder() {
        return holder;
    }



    public Double balance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double withdrawLimit() {
        return withdrawLimit;
    }

    public Account setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
        return this;
    }

    public void deposit(Double amount){
        setBalance(this.balance + amount);
    }

    public void withdraw(Double amount) throws AccountException {
        if (withdrawLimit < amount){
            throw new AccountException("The amount exceeds withdraw limit");
        }
        if (balance < amount){
            throw new AccountException("Not enough balance");
        }
        setBalance(this.balance - amount);
    }
}
