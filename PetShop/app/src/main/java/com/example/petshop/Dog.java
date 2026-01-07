package com.example.petshop;

import java.util.Date;

public class Dog extends Pet implements Pettable{

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override //override ignores the superclass instructions and does this instead
    public String speak() {
        return "bark";
    }

    @Override
    public void pet() {

    }
}
