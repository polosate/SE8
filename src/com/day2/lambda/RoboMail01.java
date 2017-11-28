package com.day2.lambda;

import java.util.List;
import java.util.function.Predicate;

public class RoboMail01 {

    public void mail(List<Employee> pl, Predicate<Employee> p) {
        for (Employee e : pl) {
            if (p.test(e)) {
                roboMail(e);
            }
        }
    }

    public void roboMail(Employee e) {
        System.out.println("===Emailing==="
            + "\nName: " + e.getFName()
            + "\nSurname: " + e.getLName()
            + "\nEmail: " + e.getEmail());
    }

}
