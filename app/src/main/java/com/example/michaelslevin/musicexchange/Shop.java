package com.example.michaelslevin.musicexchange;

import java.util.ArrayList;

/**
 * Created by michaelslevin on 29/10/2017.
 */

public class Shop {
    private ArrayList<Sellable> stock;

    public Shop(ArrayList<Sellable> stock) {
        this.stock = stock;
    }

    public ArrayList<Sellable> getStock() {
        return stock;
    }

    public void addItem(Sellable item){
        stock.add(item);

    }

    public void removeItem(Sellable item){
        stock.remove(item);
    }

}


