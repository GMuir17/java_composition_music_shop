package Shops;

import Behaviours.ISell;
import Instruments.Guitar;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList getStock() {
        return this.stock;
    }

    public void addToStock(ISell item) {
        this.stock.add(item);
    }
}
