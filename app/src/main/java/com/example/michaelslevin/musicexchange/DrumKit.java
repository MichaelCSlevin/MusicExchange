package com.example.michaelslevin.musicexchange;

/**
 * Created by michaelslevin on 28/10/2017.
 */

public class DrumKit extends Instrument implements Playable {
    private int buyPrice;
    private int sellPrice;
    private int numberOfDrums;

    public DrumKit(String brand, int buyPrice, int sellPrice, int numberOfDrums) {
        super(brand);
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
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
        return (sellPrice - buyPrice);
    }

}


