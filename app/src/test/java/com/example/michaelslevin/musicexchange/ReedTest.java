package com.example.michaelslevin.musicexchange;

import com.example.michaelslevin.musicexchange.Equipment.Reed;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michaelslevin on 29/10/2017.
 */

public class ReedTest {
    Reed reed;

    @Before
    public void before() {
        reed = new Reed("reed", 15, 30);
    }

    @Test
    public void canGetMarkup() {
        assertEquals(15, reed.calculateMarkUp());
    }



}