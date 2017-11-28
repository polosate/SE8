package com.example.domain;

import com.example.business.EmployeeStockPlan;
import java.text.NumberFormat;

public class Employee {

    private final int empID;
    private String name;
    private final String ssn;
    private double salary;

    public Employee(int empID, String name, String ssn, double salary) {
        this.empID = empID;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public int getEmpID() {
        return this.empID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        }
    }

    public String getSsn() {
        return this.ssn;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double increase) {
        if (increase > 0) {
            this.salary += increase;
        }
    }

    public int grantStock() {
        return EmployeeStockPlan.grantStock(this);
    }

    @Override
    public String toString() {
        return "Employee type: " + this.getClass().getSimpleName()
            + "\nID: " + this.empID
            + "\nName: " + this.name
            + "\nSsn: " + this.ssn
            + "\nSalary: " + NumberFormat.getCurrencyInstance().format((double) getSalary());
    }

    public static void printEmployee(Employee e) {
        System.out.println(e);
    }

    public static void printEmployee(Employee e, EmployeeStockPlan stock) {
        printEmployee(e);
        System.out.println("Stock Options: " + stock.grantStock(e));

    }
}
