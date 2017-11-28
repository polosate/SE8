package com.day2.lambda;

import java.util.List;
import java.util.function.Predicate;

public class RoboMail01Test {

    public static void main(String[] args) {
        List<Employee> people = Employee.createList();
        Predicate<Employee> hasEmail
            = p -> !p.getEmail().equals("");

        RoboMail01 robo01 = new RoboMail01();
        robo01.mail(people, hasEmail);

    }

}
