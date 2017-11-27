package com.example.domain;

public class Manager extends Employee {
    private String deptName;

    public Manager(int empID, String name, String ssn, double salary, String deptName) {
        super(empID, name, ssn, salary);
        this.deptName = deptName;
    }
    
    public String getDeptName() {
        return this.deptName;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Depatment name: " + this.deptName;
    }
}
