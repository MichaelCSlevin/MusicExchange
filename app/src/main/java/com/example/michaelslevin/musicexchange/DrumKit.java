package com.example.michaelslevin.musicexchange;

import com.example.michaelslevin.musicexchange.enums.InstrumentType;

import static com.example.michaelslevin.musicexchange.enums.InstrumentType.PERCUSSION;

/**
 * Created by michaelslevin on 28/10/2017.
 */

public class DrumKit extends Instrument implements Playable, Sellable{
    private int buyPrice;
    private int sellPrice;
    private int numberOfDrums;

    public DrumKit(String brand, int buyPrice, int sellPrice, int numberOfDrums) {
        super(brand, buyPrice, sellPrice, InstrumentType.PERCUSSION);
        this.numberOfDrums = numberOfDrums;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }

    public String play() {
        return "thump";
    }

    public int calculateMarkUp(){
        return getSellPrice() - getBuyPrice();  //gets attributes from getters in Instrument class
    }

}


