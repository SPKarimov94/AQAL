package org.example;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Dog", 1, "red");
        Animal animal = new Animal("Animal", 2);

        dog.sound();
        animal.sound();
        animal.sound("tes");


    }

}
