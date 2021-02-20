package shop;

import instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShopTest {

    public Shop shop;
    public Piano piano;
    public Trombone trombone;
    public Accessory accessory;

    @Before
    public void before(){
        shop = new Shop();
        accessory = new Accessory("Guitar Strings x5", 3, 7);
        piano = new Piano(InstrumentType.PERCUSSION, "Cast iron",  "Black", 1799, 2350, PianoType.UPRIGHT);
        trombone = new Trombone(InstrumentType.BRASS, "Brass", "Silver", 180, 225, TromboneType.BASE);
    }

    @Test
    public void shopHasStock(){
        assertNotNull(shop.getStock());
    }

    @Test
    public void canAddItemToStock(){
        shop.addItemToStock(piano);
        shop.addItemToStock(accessory);
        assertEquals(2, shop.getItemInStockCount());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.addItemToStock(piano);
        shop.addItemToStock(accessory);
        shop.addItemToStock(trombone);
        assertEquals(3, shop.getItemInStockCount());
        shop.removeItemFromStock(piano);
        assertEquals(2, shop.getItemInStockCount());
    }
}
