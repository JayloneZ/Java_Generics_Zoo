package com.example.user.zoo;

import java.util.ArrayList;

/**
 * Created by user on 10/11/2017.
 */

public class Zoo {

    private ArrayList<Enclosure> enclosures;
    private int money;

    public Zoo() {
        this.enclosures = new ArrayList();
        this.money = 0;
    }

    public void add(Enclosure enclosure) {
        this.enclosures.add(enclosure);
    }

    public int getAmountOfEnclosures() {
        return enclosures.size();
    }

    public void remove(Enclosure enclosure) {
        this.enclosures.remove(enclosure);
    }

    public int getTotalAmountOfAnimals() {
        int totalAnimals = 0;

        for ( Enclosure enclosure : this.enclosures ) {
            totalAnimals += enclosure.getAmount();
        }

        return totalAnimals;
    }

    public int getTotalValue() {
        int totalValue = 0;

        for ( Enclosure enclosure : this.enclosures ) {
            totalValue += enclosure.getTotalValue();
        }

        return totalValue;
    }

    public void sellAnimal(Animal animal) {
        for ( Enclosure enclosure : this.enclosures ) {
            if (enclosure.getAnimals().contains(animal)) {
                this.money += animal.getCashValue();
                enclosure.remove(animal);
            }
        }
    }

    public int getMoney() {
        return money;
    }
}
