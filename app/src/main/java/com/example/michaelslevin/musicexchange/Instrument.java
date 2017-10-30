package com.example.michaelslevin.musicexchange;

import com.example.michaelslevin.musicexchange.enums.InstrumentType;

/**
 * Created by michaelslevin on 28/10/2017.
 */

public abstract class Instrument implements Playable, Sellable{
    private String brand;
    private InstrumentType instrumentType;
    protected int buyPrice;
    protected int sellPrice; //Open Closed Principle - changed from private to protected to allow more instruments to be created more easily.

    public Instrument(String brand, int buyPrice,
                      int sellPrice, InstrumentType instrumentType) {
        this.brand = brand;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.instrumentType = instrumentType;
    }

    public String getBrand() {
        return brand;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public abstract String play();

}
