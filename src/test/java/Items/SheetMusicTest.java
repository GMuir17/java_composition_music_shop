package Items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setUp() {
        this.sheetMusic = new SheetMusic("Chopin", 10, 50);
    }

    @Test
    public void hasDescription() {
        assertEquals("Chopin", sheetMusic.getDescription());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(10, sheetMusic.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(50, sheetMusic.getSellingPrice());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(40, sheetMusic.calculateMarkup());
    }


}
