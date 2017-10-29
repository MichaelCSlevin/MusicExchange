package com.example.michaelslevin.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michaelslevin on 28/10/2017.
 */

public class ThereminTest {
    Theremin theremin;

    @Before
    public void before(){
        theremin = new Theremin("moog", 250, 300, 5);
    }

    @Test
    public void canPlay(){
        assertEquals("eee-woo", theremin.play());
}

    @Test
    public void canGetMarkup(){
        assertEquals(50, theremin.calculateMarkUp());
    }


}