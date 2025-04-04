package com.farm;

import java.util.ArrayList;

public class Farm {
    private ArrayList<Animal> animals;

    public Farm() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void countAnimalTypes() {
        int cowCount = 0, goatCount = 0, henCount = 0, horseCount = 0, otherCount = 0;

        for (Animal animal : animals) {
            switch (animal.getType()) {
                case "Cow":
                    cowCount++;
                    break;
                case "Goat":
                    goatCount++;
                    break;
                case "Hen":
                    henCount++;
                    break;
                case "Horse":
                    horseCount++;
                    break;
                default:
                    otherCount++;
            }
        }

        System.out.println("Total Cows: " + cowCount);
        System.out.println("Total Goats: " + goatCount);
        System.out.println("Total Hens: " + henCount);
        System.out.println("Total Horses: " + horseCount);
        System.out.println("Other Animals: " + otherCount);
    }

    public void countProducers() {
        int milkCount = 0, eggCount = 0;

        for (Animal animal : animals) {
            if (animal.producesMilk()) {
                milkCount++;
            }
            if (animal.producesEggs()) {
                eggCount++;
            }
        }

        System.out.println("Animals Producing Milk: " + milkCount);
        System.out.println("Animals Producing Eggs: " + eggCount);
    }
}