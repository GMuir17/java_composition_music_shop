package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        this.guitar = new Guitar("Jazz", "Maple", "Schring", InstrumentFamily.STRING, 100, 150);
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



}
