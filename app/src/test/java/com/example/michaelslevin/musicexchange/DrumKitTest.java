package com.example.michaelslevin.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michaelslevin on 28/10/2017.
 */

public class DrumKitTest {
        DrumKit drumkit;

        @Before
        public void before() {
            drumkit = new DrumKit("Pearl", 800, 1000, 4);
        }

        @Test
        public void canPlay(){
            assertEquals("thump", drumkit.play());

        }

        @Test
        public void canCalculateMarkUp(){
            assertEquals(200, drumkit.calculateMarkUp());
        }


    }
