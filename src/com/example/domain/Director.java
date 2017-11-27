package com.example.domain;



public class Director extends Manager{
    private double budget;

    public Director(int empID, String name, String ssn, double salary, String deptName, double budget) {
        super(empID, name, ssn, salary, deptName);
        this.budget = budget;
    }
    
    public double getBuget() {
        return this.budget;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nBudget: " + this.budget;
    }
}
