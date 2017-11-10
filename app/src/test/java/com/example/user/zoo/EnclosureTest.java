package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 10/11/2017.
 */

public class EnclosureTest {
    Enclosure<Lion> lionEnclosure;
    Lion lion;
    Lion lion2;

    @Before
    public void before() {
        lionEnclosure = new Enclosure();
        lion = new Lion();
        lion2 = new Lion();
    }


    @Test
    public void enclosureStartsEmpty() {
        assertEquals(0, lionEnclosure.getAnimalAmount());
    }

    @Test
    public void canTakeAnimals() {
        lionEnclosure.add(lion);
        assertEquals(1, lionEnclosure.getAnimalAmount());
    }

    @Test
    public void canTakeMultipleAnimalsOfSameType() {
        lionEnclosure.add(lion);
        lionEnclosure.add(lion2);
        assertEquals(2, lionEnclosure.getAnimalAmount());
    }

    @Test
    public void canRemoveAnimals() {
        lionEnclosure.add(lion);
        lionEnclosure.remove(lion);
        assertEquals(0, lionEnclosure.getAnimalAmount());
    }

    @Test
    public void canGetTotalValue() {
        lionEnclosure.add(lion);
        lionEnclosure.add(lion2);
        assertEquals(180, lionEnclosure.getTotalValue());
    }

}
