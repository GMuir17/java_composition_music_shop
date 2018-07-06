package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() {
        this.piano = new Piano("Yamaha", "Plastic", "Plink", InstrumentFamily.KEYBOARD, 1000, 2500, PianoType.ELECTRIC);
    }

    @Test
    public void hasName() {
        assertEquals("Yamaha", this.piano.getName());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Plastic", this.piano.getMaterial());
    }

    @Test
    public void hasFamily() {
        assertEquals(InstrumentFamily.KEYBOARD, piano.getInstrumentFamily());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(1000, piano.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(2500, piano.getSellingPrice());
    }

    @Test
    public void canPlay() {
        assertEquals("Plink", piano.play());
    }

    @Test
    public void hasPianoType() {
        assertEquals(PianoType.ELECTRIC, piano.getType());
    }

}
