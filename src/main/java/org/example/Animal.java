package org.example;

public class Animal {

    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sound() {
        System.out.println("sound");
    }
    public void sound(String name) {
        System.out.println("sound " + name);
    }

}
