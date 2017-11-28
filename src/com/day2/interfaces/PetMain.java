package com.day2.interfaces;

public class PetMain {

    public static void main(String[] args) {
        Animal a;
        //test a spider with a spider reference
        Spider s = new Spider();
        s.eat();
        s.walk();
        //test a spider with an animal reference
        a = new Spider();
        a.eat();
        a.walk();

        a = new Fish();
        a.eat();
        a.walk();

        Fish f = new Fish();
        f.eat();
        f.walk();
        f.play();
    }

    public static void playWithAnimal(Animal a) {
        // completed in practice
    }

}
