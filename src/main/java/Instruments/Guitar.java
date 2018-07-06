package Instruments;

public class Guitar extends Instrument {

    private GuitarType type;

    public Guitar(String name, String material, String sound, InstrumentFamily family, int buyingPrice, int sellingPrice) {
        super(name, material, sound, family, buyingPrice, sellingPrice);
        this.type = type;
    }


}
