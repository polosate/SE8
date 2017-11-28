package com.day2.abstractBanking;

public abstract class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public abstract boolean withdraw(double amount);
    public String getDescription() {
        return "Account balance = " + balance;
    }
    public double getBalance() {
        return this.balance;
    }
}
