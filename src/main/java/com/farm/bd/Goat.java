package com.farm;

public class Goat extends Animal {
    public Goat(String name) {
        super(name, "Goat");
    }

    @Override
    public boolean producesMilk() {
        return true;
    }
}