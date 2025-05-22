package org.example;

public class Dog extends Animal {

    private String color;

    @Override
    public void sound() {
        System.out.println("Dog sound");
    }

    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;

    }
}
