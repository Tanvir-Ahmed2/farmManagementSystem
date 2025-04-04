package com.farm;

public class Hen extends Animal {
    public Hen(String name) {
        super(name, "Hen");
    }

    @Override
    public boolean producesEggs() {
        return true;
    }
}