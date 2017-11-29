package com.day2.abstractBanking;

public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > super.balance) {
            return false;
        } else {
            super.balance -= amount;
            return true;
        }
    }

    @Override
    public String getDescription() {
        return "Saving account";
    }

    @Override
    public String toString() {
        return this.getDescription();
    }
}
