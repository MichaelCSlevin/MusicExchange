package com.example.michaelslevin.musicexchange;

import com.example.michaelslevin.musicexchange.enums.InstrumentType;

/**
 * Created by michaelslevin on 28/10/2017.
 */

public abstract class Instrument implements Playable {
    private String brand;
    private InstrumentType instrumentType;
    private int buyPrice;
    private int sellPrice;

    public Instrument(String brand, int buyPrice,
                      int sellPrice, InstrumentType instrumentType) {
        this.brand = brand;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.instrumentType = instrumentType;
    }


    public abstract String play();

}
