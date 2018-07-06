package Instruments;

public class Piano extends Instrument {

    private PianoType type;

    public Piano(String name, String material, String sound, InstrumentFamily family, int buyingPrice, int sellingPrice, PianoType type) {
        super(name, material, sound, family, buyingPrice, sellingPrice);
        this.type = type;
    }

    public PianoType getType() {
        return this.type;
    }

}
