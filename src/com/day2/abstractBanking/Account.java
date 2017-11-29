package com.day2.abstractBanking;

public abstract class Account {

    protected double balance;

    public abstract boolean withdraw(double amount);

    public abstract String getDescription();

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public String toString() {
        return this.getDescription() + " balance is " + this.getBalance();
    }
}
