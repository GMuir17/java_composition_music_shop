package Items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CapoTest {

    Capo capo;

    @Before
    public void setUp() {
        this.capo = new Capo("Trigger Black", 2, 10);
    }

    @Test
    public void hasDescription() {
        assertEquals("Trigger Black", capo.getDescription());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(2, capo.getBuyingPrice());
    }


}
