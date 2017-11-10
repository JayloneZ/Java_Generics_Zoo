package com.example.user.zoo;

import java.util.ArrayList;

/**
 * Created by user on 10/11/2017.
 */

public class Enclosure<T> {

    ArrayList<T> animals;

    public Enclosure() {
        this.animals = new ArrayList();
    }

    public void add(T animal) {
        this.animals.add(animal);
    }

    public int getAnimalAmount() {
        return this.animals.size();
    }
}
