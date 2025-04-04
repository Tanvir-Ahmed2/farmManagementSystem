package com.farm;

public class Cow extends Animal {
    public Cow(String name) {
        super(name, "Cow");
    }

    @Override
    public boolean producesMilk() {
        return true;
    }
}