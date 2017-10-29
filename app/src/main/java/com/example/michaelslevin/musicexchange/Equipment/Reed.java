package com.example.michaelslevin.musicexchange.Equipment;

import com.example.michaelslevin.musicexchange.Sellable;

/**
 * Created by michaelslevin on 29/10/2017.
 */

public class Reed implements Sellable {
    private String type;
    private int buyPrice;
    private int sellPrice;

    public Reed(String type, int buyPrice, int sellPrice) {
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getType() {
        return type;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int calculateMarkUp(){
        return (sellPrice - buyPrice);
    }
}

