package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 10/11/2017.
 */

public class ZooTest {
    Enclosure<Lion> lionEnclosure;
    Enclosure<Monkey> monkeyEnclosure;
    Lion lion;
    Lion lion2;
    Monkey monkey;
    Zoo zoo;

    @Before
    public void before() {
        lionEnclosure = new Enclosure();
        monkeyEnclosure = new Enclosure();
        lion = new Lion();
        lion2 = new Lion();
        monkey = new Monkey();
        zoo = new Zoo();
    }


    @Test
    public void zooStartsEmpty() {
        assertEquals(0, zoo.getAmountOfEnclosures());
    }

    @Test
    public void canAddEnclosures() {
        zoo.add(lionEnclosure);
        assertEquals(1, zoo.getAmountOfEnclosures());
    }

    @Test
    public void canRemoveEnclosures() {
        zoo.add(lionEnclosure);
        zoo.remove(lionEnclosure);
        assertEquals(0, zoo.getAmountOfEnclosures());
    }

    @Test
    public void canCountTotalAnimals() {
        zoo.add(lionEnclosure);
        zoo.add(monkeyEnclosure);
        lionEnclosure.add(lion);
        lionEnclosure.add(lion2);
        monkeyEnclosure.add(monkey);
        assertEquals(3, zoo.getTotalAmountOfAnimals());
    }

    @Test
    public void canCalculateTotal() {
        zoo.add(monkeyEnclosure);
        zoo.add(lionEnclosure);
        monkeyEnclosure.add(monkey);
        lionEnclosure.add(lion);
        assertEquals(130, zoo.getTotalValue());
    }

    @Test
    public void canSellAnimal() {
        zoo.add(lionEnclosure);
        lionEnclosure.add(lion);
        lionEnclosure.add(lion2);
        zoo.sellAnimal(lion);
        assertEquals(1, lionEnclosure.getAnimalAmount());
        assertEquals(90, zoo.getMoney());
    }

}
