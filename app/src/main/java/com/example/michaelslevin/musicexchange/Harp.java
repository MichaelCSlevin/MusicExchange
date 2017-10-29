package com.example.michaelslevin.musicexchange;

/**
 * Created by michaelslevin on 28/10/2017.
 */

public class Harp extends Instrument implements Playable {
    private int buyPrice;
    private int sellPrice;
    private int stringNumber;

    public Harp(String brand, int buyPrice, int sellPrice, int stringNumber) {
        super(brand);
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.stringNumber = stringNumber;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int getStringNumber() {
        return stringNumber;
    }

    public String play() {
        return "twing";
    }


    public int calculateMarkUp(){
        return (sellPrice - buyPrice);
    }

}
