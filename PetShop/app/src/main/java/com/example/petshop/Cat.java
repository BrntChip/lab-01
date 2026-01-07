package com.example.petshop;

import java.util.Date;

public class Cat extends Pet implements Pettable{

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override //override ignores the superclass instructions and does this instead
    public String speak() {
        return "meow";
    }

    @Override
    public void pet() {

    }
}
