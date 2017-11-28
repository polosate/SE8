package com.example;

import com.example.business.EmployeeStockPlan;
import com.example.domain.*;

public class EmployeeTest {

    public static void main(String[] args) {
        EmployeeStockPlan esp = new EmployeeStockPlan();
        Employee emp1 = new Employee(101, "Jane Smith", "012-34-5678", 120_345.27);
        Employee.printEmployee(emp1, esp);

        Manager mgr = new Manager(102, "John Smith", "333-333-333", 120_345.27, "Blablabla");
        Employee.printEmployee(mgr, esp);
        mgr.raiseSalary(100);
        Employee.printEmployee(mgr, esp);
    }
}
