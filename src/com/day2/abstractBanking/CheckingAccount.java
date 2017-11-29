package com.day2.abstractBanking;

public class CheckingAccount extends Account {

    private double overDratfLimit;

    public CheckingAccount(double balance) {
        super(balance);
        this.overDratfLimit = 0;
    }

    public CheckingAccount(double balance, double overDraftLimit) {
        super(balance);
        this.overDratfLimit = overDraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (this.overDratfLimit + super.balance < amount) {
            return false;
        } else {
            super.balance -= amount;
            return true;
        }
    }

    @Override
    public String getDescription() {
        return "Cheking account";
    }

    @Override
    public String toString() {
        return this.getDescription();
    }
}
