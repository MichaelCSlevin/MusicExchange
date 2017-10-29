package com.example.michaelslevin.musicexchange;

import com.example.michaelslevin.musicexchange.Equipment.Sticks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michaelslevin on 29/10/2017.
 */

public class SticksTest {
    Sticks sticks;

    @Before
    public void before(){
        sticks = new Sticks ("drumsticks", 5, 15);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(10, sticks.calculateMarkUp());
    }
}
