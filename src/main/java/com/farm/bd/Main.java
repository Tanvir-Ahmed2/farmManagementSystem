package com.farm.bd;

import com.farm.Farm;
import com.farm.Cow;
import com.farm.Goat;
import com.farm.Hen;
import com.farm.Horse;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();

        farm.addAnimal(new Cow("Cow1"));
        farm.addAnimal(new Cow("Cow2"));
        farm.addAnimal(new Hen("Hen1"));
        farm.addAnimal(new Hen("Hen2"));
        farm.addAnimal(new Horse("Horse1"));
        farm.addAnimal(new Goat("Goat1"));
        farm.addAnimal(new Goat("Goat2"));


        System.out.println("Animal Count");
        farm.countAnimalTypes();


        System.out.println("\nProduction Count");
        farm.countProducers();
    }
}