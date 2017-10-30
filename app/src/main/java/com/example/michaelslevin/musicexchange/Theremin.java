package com.example.michaelslevin.musicexchange;

import com.example.michaelslevin.musicexchange.enums.InstrumentType;

/**
 * Created by michaelslevin on 28/10/2017.
 */

public class Theremin extends Instrument{
    private int buyPrice;
    private int sellPrice;
    private int pitch;

    public Theremin(String brand, int buyPrice, int sellPrice, int pitch) {
        super(brand, buyPrice, sellPrice, InstrumentType.ELECTRONIC);
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.pitch = pitch; //Dependency Inversion Principle - too many attributes that are already set by abstract class
    }

    public String play() {
        return "eee-woo";
    }


    public int calculateMarkUp() {
        return (sellPrice - buyPrice);
    }

}