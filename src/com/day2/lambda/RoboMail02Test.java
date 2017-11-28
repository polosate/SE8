/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.day2.lambda;

import java.util.List;

/**
 *
 * @author ashaposhnikova
 */
public class RoboMail02Test {

    public static void main(String[] args) {
        List<Employee> pl = Employee.createList();
        RoboMail02 robo02 = new RoboMail02();

        pl.stream()
            .filter(p -> p.getAge() > 30)
            .filter(p -> p.getSalary() > 200_000.00)
            .forEach(p -> robo02.roboMail(p));

    }

}
