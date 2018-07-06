package Instruments;

import org.junit.Before;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        this.guitar = new Guitar("Maple", "Shring", InstrumentFamily.STRING, 100, 150);
    }




}
