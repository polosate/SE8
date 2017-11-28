package com.day2.lambda;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String fName;
    private String lName;
    private int age;
    private double salary;
    private Role role;
    private String email;
    private String phone;

    public static class Builder {

        private String fName = "";
        private String lName = "";
        private int age = 0;
        private double salary = 0.0;
        private Role role = Role.MANAGER;
        private String email = "";
        private String phone = "";

        public Employee.Builder setFName(String fName) {
            this.fName = fName;
            return this;
        }

        public Employee.Builder setLName(String lName) {
            this.lName = lName;
            return this;
        }

        public Employee.Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Employee.Builder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Employee.Builder setRole(Role role) {
            this.role = role;
            return this;
        }

        public Employee.Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Employee.Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }

    }

    private Employee() {
        super();
    }

    public String getFName() {
        return this.fName;
    }

    public String getLName() {
        return this.lName;
    }

    public String getEmail() {
        return this.email;
    }

    private Employee(Employee.Builder builder) {
        this.fName = builder.fName;
        this.lName = builder.lName;
        this.age = builder.age;
        this.salary = builder.salary;
        this.role = builder.role;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    public static List<Employee> createList() {
        List<Employee> people = new ArrayList<>();

        people.add(
            new Employee.Builder()
                .setFName("John")
                .setLName("Smith")
                .setAge(18)
                .setEmail("john@smith.com")
                .build()
        );

        people.add(
            new Employee.Builder()
                .setFName("Jane")
                .setLName("Oster")
                .setAge(35)
                .setPhone("111-222-333")
                .build()
        );

        people.add(
            new Employee.Builder()
                .setFName("Bill")
                .setLName("Todd")
                .setAge(24)
                .setEmail("bill@todd.com")
                .build()
        );

        people.add(
            new Employee.Builder()
                .setFName("Alice")
                .setLName("Smith")
                .setAge(20)
                .setPhone("333-444")
                .build()
        );

        people.add(
            new Employee.Builder()
                .setFName("Kevin")
                .setLName("Black")
                .setAge(54)
                .setEmail("kevin@black.com")
                .build()
        );

        return people;
    }

}
