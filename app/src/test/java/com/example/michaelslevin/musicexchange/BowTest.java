package com.example.michaelslevin.musicexchange;

import com.example.michaelslevin.musicexchange.Equipment.Bow;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michaelslevin on 29/10/2017.
 */

public class BowTest {
    Bow bow;

    @Before
    public void before() {
        bow = new Bow("bow", 40, 80);
    }


    @Test
    public void canGetMarkup(){
        assertEquals(40, bow.calculateMarkUp());
    }

}
