package org.example;

public class Main {
    public static void main(String[] args) {
        Dog dog = Dog.builder()
                .name("Dog")
                .age(10)
                .color("brown")
                .build();

        Animal animal = Animal.builder()
                .name("Animal")
                .age(5)
                .build();

        dog.sound();                     // Dog sound
        animal.sound();                 // sound
        animal.sound("tes");            // sound tes

        System.out.println(dog);        // вывод с @ToString
    }
}
