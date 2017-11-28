package com.day2.interfaces;

public class Fish extends Animal implements Pet {

    private String name;

    public Fish() {
        super(0);
    }

    public Fish(String name) {
        super(0);
        this.name = name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void play() {
        System.out.println("Just keep swimming");
    }

    @Override
    public void eat() {
        System.out.println("Fish eat pond scum");
    }

    @Override
    public void walk() {
        System.out.println("Fish, of course, can't walk, they swim");
    }

}
