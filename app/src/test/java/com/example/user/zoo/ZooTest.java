package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 10/11/2017.
 */

public class ZooTest {
    Enclosure<Lion> lionEnclosure;
    Zoo zoo;

    @Before
    public void before() {
        lionEnclosure = new Enclosure();
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

}
