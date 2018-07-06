package Instruments;

public class Guitar extends Instrument {

    private GuitarType type;

    public Guitar(String material, String sound, InstrumentFamily family, int buyingPrice, int sellingPrice) {
        super(material, sound, family, buyingPrice, sellingPrice);
        this.type = type;
    }


}
