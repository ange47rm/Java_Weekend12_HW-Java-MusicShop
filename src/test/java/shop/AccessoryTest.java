package shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory accessory;

    @Before
    public void before(){
        accessory = new Accessory("Guitar Strings x5", 3, 7);
    }

    @Test
    public void accessoryHasName(){
        assertEquals("Guitar Strings x5", accessory.getAccessoryName());
    }

    @Test
    public void canChangeAccessoryName(){
        accessory.setAccessoryName("Drum sticks");
        assertEquals("Drum sticks", accessory.getAccessoryName());
    }

    @Test
    public void accessoryHasBuyPrice(){
        assertEquals(3, accessory.getBuyPrice());
    }

    @Test
    public void canChangeAccessoryBuyPrice(){
        accessory.setBuyPrice(4);
        assertEquals(4, accessory.getBuyPrice());
    }

    @Test
    public void accessoryHasSellPrice(){
        assertEquals(7, accessory.getSellPrice());
    }

    @Test
    public void canChangeAccessorySellPrice(){
        accessory.setSellPrice(9);
        assertEquals(9, accessory.getSellPrice());
    }

    @Test
    public void canCalculateAccessoryMarkup(){
        assertEquals(4, accessory.calculateMarkup());
    }

}
