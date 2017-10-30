package com.example.michaelslevin.musicexchange;

import com.example.michaelslevin.musicexchange.enums.InstrumentType;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michaelslevin on 28/10/2017.
 */

public class Ocarina extends Instrument {
    private String brand;
    private int buyPrice;
    private int sellPrice;
    private String colour;

    public Ocarina( String brand, int buyPrice, int sellPrice, String colour) {
        super(brand, buyPrice, sellPrice, InstrumentType.WOODWIND);
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice; //Dependency Inversion Principle - too many attributes that are already set by abstract class
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
//Dependency Inversion Principle - too many methods  that are already set by abstract class

}
