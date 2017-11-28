package com.day1.employee.business;

import com.day1.employee.domain.Employee;
import com.day1.employee.domain.Director;
import com.day1.employee.domain.Manager;

public class EmployeeStockPlan {    
    public static int grantStock(Employee e) {
        if (e instanceof Director) {
           return 1000;
        } else if (e instanceof Manager) {
            return 100;
        } else {
            return 10;
        }
    }
    
}
