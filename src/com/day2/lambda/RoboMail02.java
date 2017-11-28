/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.day2.lambda;

/**
 *
 * @author ashaposhnikova
 */
public class RoboMail02 {

    public void roboMail(Employee e) {
        System.out.println(
            "=== Emailling: ==="
            + "\n Name: " + e.getFName()
            + "\nAge: " + e.getAge()
            + "\nSalary: " + e.getSalary());
    }
}
