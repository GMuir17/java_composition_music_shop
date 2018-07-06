package Instruments;

import Behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private String name;
    private String material;
    private String sound;
    private InstrumentFamily family;
    private int buyingPrice;
    private int sellingPrice;

    public Instrument(String name, String material, String sound, InstrumentFamily family, int buyingPrice, int sellingPrice) {
        this.name = name;
        this.material = material;
        this.sound = sound;
        this.family = family;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getName() {
        return this.name;
    }

    public InstrumentFamily getInstrumentFamily() {
        return this.family;
    }

    public int getBuyingPrice() {
        return this.buyingPrice;
    }

    public int getSellingPrice() {
        return this.sellingPrice;
    }

    public String play() {
        return this.sound;
    }


}
