package Shops;

import Instruments.Guitar;
import Instruments.GuitarType;
import Instruments.InstrumentFamily;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;

    @Before
    public void setUp() {
        this.shop = new Shop("Jimmy Egypt's");
        this.guitar = new Guitar("Jackson", "Steel", "Struuum", InstrumentFamily.STRING, 50, 200, GuitarType.STEEL);
    }

    @Test
    public void hasName() {
        assertEquals("Jimmy Egypt's", shop.getName());
    }

    @Test
    public void hasEmptyStock() {
        ArrayList emptyStock = shop.getStock();
        assertEquals(0, emptyStock.size());
    }

    @Test
    public void canAddInstrumentToStock() {
        shop.addToStock(guitar);
        ArrayList emptyStock = shop.getStock();
        assertEquals(1, emptyStock.size());
    }
}
