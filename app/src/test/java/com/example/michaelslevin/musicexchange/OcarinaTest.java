package com.example.michaelslevin.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michaelslevin on 28/10/2017.
 */

public class OcarinaTest {
    Ocarina ocarina;

    @Before
    public void before() {
        ocarina = new Ocarina("TNG", 10, 15, "blue");
    }

    @Test
    public void canPlay(){
        assertEquals("Saria's Song", ocarina.play());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(5, ocarina.calculateMarkUp());
    }

















}
