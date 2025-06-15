package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
public class Animal {
    private String name;
    private int age;

    public void sound() {
        System.out.println("sound");
    }

    public void sound(String name) {
        System.out.println("sound " + name);
    }
}
