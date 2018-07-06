package Shops;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void setUp() {
        this.shop = new Shop("Jimmy Egypt's");
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

}
