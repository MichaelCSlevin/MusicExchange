package com.example.michaelslevin.musicexchange;

import com.example.michaelslevin.musicexchange.Equipment.Pedal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michaelslevin on 29/10/2017.
 */

public class PedalTest {
    Pedal pedal;

    @Before
    public void before() {
        pedal = new Pedal("pedal", 80, 150);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(70, pedal.calculateMarkUp());
    }

}
