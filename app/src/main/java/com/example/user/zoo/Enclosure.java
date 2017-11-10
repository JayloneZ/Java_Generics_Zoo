package com.example.user.zoo;

import java.util.ArrayList;

/**
 * Created by user on 10/11/2017.
 */

public class Enclosure<T> {

    private ArrayList<T> animals;

    public Enclosure() {
        this.animals = new ArrayList();
    }

    public void add(T animal) {
        this.animals.add(animal);
    }

    public void remove(T animal) {
        this.animals.remove(animal);
    }

    public int getAnimalAmount() {
        return this.animals.size();
    }

    public ArrayList getAnimals() {
        return this.animals;
    }

    public int getAmount() {
        return this.animals.size();
    }

//    public int getTotalValue() {
//        int totalValue = 0;
//        for ( T animal : this.animals ) {
//            totalValue += animal.getCashValue();
//        }
//    }

}
