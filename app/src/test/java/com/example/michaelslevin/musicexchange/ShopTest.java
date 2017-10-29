package com.example.michaelslevin.musicexchange;

import com.example.michaelslevin.musicexchange.Equipment.Bow;
import com.example.michaelslevin.musicexchange.Equipment.Pedal;
import com.example.michaelslevin.musicexchange.Equipment.Reed;
import com.example.michaelslevin.musicexchange.Equipment.Sticks;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by michaelslevin on 29/10/2017.
 */

public class ShopTest {

    Shop shop;
    ArrayList<Sellable> stock;
    DrumKit drumkit;
    Ocarina ocarina;
    Theremin theremin;
    Harp harp;
    Bow bow;
    Pedal pedal;
    Reed reed;
    Sticks sticks;


    @Before
    public void before() {
        stock = new ArrayList<Sellable>();
        drumkit = new DrumKit("Pearl", 800, 1000, 4);
        ocarina = new Ocarina("TNG", 10, 15, "blue");
        theremin = new Theremin("moog", 250, 300, 5);
        harp = new Harp("Pilgrim", 5000, 10000, 47);
        bow = new Bow("bow", 40, 80);
        pedal = new Pedal("pedal", 80, 150);
        reed = new Reed("reed", 15, 30);
        sticks = new Sticks ("drumsticks", 5, 15);


        stock.add(drumkit);
        stock.add(ocarina);
        stock.add(theremin);
        stock.add(harp);
        stock.add(bow);
        stock.add(pedal);
        stock.add(reed);

        shop = new Shop(stock);


    }

    @Test
    public void canAddStock(){
        shop.addItem(sticks);
        assertTrue(shop.getStock().contains(sticks));
    }

    @Test
    public void canRemoveStock(){
        shop.removeItem(harp);
        assertFalse(shop.getStock().contains(harp));
    }




}
