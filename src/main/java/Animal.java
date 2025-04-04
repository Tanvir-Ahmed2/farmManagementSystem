package com.farm;

public abstract class Animal {
    private String name;
    private String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean producesMilk() {
        return false;
    }

    public boolean producesEggs() {
        return false;
    }
}