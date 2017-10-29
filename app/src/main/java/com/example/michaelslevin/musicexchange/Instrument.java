package com.example.michaelslevin.musicexchange;

/**
 * Created by michaelslevin on 28/10/2017.
 */

public abstract class Instrument implements Playable {
    private String brand;
    private int buyPrice;
    private int sellPrice;

    public Instrument(String brand) {
        this.brand = brand;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }


    public abstract String play();

}
