package com.example.michaelslevin.musicexchange;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michaelslevin on 28/10/2017.
 */

public class Ocarina extends Instrument implements Playable {
    private String brand;
    private int buyPrice;
    private int sellPrice;
    private String colour;

    public Ocarina( String brand, int buyPrice, int sellPrice, String colour) {
        super(brand);
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.colour = colour;


    }

    public String getBrand() {
        return brand;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public String getColour() {
        return colour;
    }

    public String play() {
        return "Saria's Song";
    }

    public int calculateMarkUp(){
        return (sellPrice - buyPrice);
    }


}
