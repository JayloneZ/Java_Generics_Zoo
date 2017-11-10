package com.example.user.zoo;

import java.util.ArrayList;

/**
 * Created by user on 10/11/2017.
 */

public class Zoo {

    ArrayList<Enclosure> enclosures;

    public Zoo() {
        this.enclosures = new ArrayList();
    }

    public void add(Enclosure enclosure) {
        this.enclosures.add(enclosure);
    }

    public int getAmountOfEnclosures() {
        return enclosures.size();
    }
}
