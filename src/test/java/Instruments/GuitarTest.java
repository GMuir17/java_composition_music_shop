package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        this.guitar = new Guitar("Jazz", "Maple", "Schring", InstrumentFamily.STRING, 100, 150, GuitarType.BASS);
    }

    @Test
    public void hasName() {
        assertEquals("Jazz", this.guitar.getName());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Maple", this.guitar.getMaterial());
    }

    @Test
    public void hasFamily() {
        assertEquals(InstrumentFamily.STRING, guitar.getInstrumentFamily());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(100, guitar.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(150, guitar.getSellingPrice());
    }

    @Test
    public void canPlay() {
        assertEquals("Schring", guitar.play());
    }

    @Test
    public void hasGuitarType() {
        assertEquals(GuitarType.BASS, guitar.getType());
    }

}
