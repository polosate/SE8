package com.day2.abstractBanking;

public class SavingsAccount extends Account{
    private final double overDraftLimit;

    public SavingsAccount(double balance, double overDraft) {
        super(balance);
        this.overDraftLimit = overDraft;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > this.getBalance()) {
            return false;
        } else {
            
            return true;
        }


    }

    public String getDescription() {
        return "Saving account" + super.getDescription();
    }

    @Override
    public String toString() {
        return this.getDescription();
    }

}
