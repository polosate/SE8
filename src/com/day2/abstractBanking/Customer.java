package com.day2.abstractBanking;

public class Customer {

    private String fname;
    private String lname;
    private Account[] accounts;
    private int numberOfAccounts;

    public Customer(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
        this.accounts = new Account[10];
        this.numberOfAccounts = 0;
    }

    public String getFname() {
        return this.fname;
    }

    public String getLname() {
        return this.lname;
    }

    public int getNubmerOfAccounts() {
        return this.numberOfAccounts;
    }

    public void addAccount(Account acct) {
        int i = this.numberOfAccounts++;
        this.accounts[i] = acct;

    }

    public Account getAccount(int accInd) {
        return this.accounts[accInd];
    }

}
