package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class Dog extends Animal {
    private String color;

    @Override
    public void sound() {
        System.out.println("Dog sound");
    }
}
