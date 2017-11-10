package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 10/11/2017.
 */

public class AnimalTest {
    Monkey monkey;
    Lion lion;

    @Before
    public void before() {
        monkey = new Monkey(40);
        lion = new Lion(90);
    }

    @Test
    public void monkeyHasCashValue() {
        assertEquals(40, monkey.getCashValue());
    }

    @Test
    public void lionHasCashValue() {
        assertEquals(90, lion.getCashValue());
    }

}
