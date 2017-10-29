package com.example.michaelslevin.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michaelslevin on 28/10/2017.
 */

public class HarpTest {
    Harp harp;

    @Before
    public void before() {
        harp = new Harp("Pilgrim", 5000, 10000, 47);
    }

    @Test
    public void canPlay(){
        assertEquals("twing", harp.play());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(5000, harp.calculateMarkUp());
    }

}
