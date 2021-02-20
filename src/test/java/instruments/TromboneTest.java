package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TromboneTest {

    Trombone trombone;

    @Before
    public void before(){
        trombone = new Trombone(InstrumentType.BRASS, "Brass", "Silver", 180, 225, TromboneType.BASE);
    }

    @Test
    public void instrumentHasType(){
        assertEquals(InstrumentType.BRASS, trombone.getFamily());
    }

    @Test
    public void instrumentHasMaterial(){
        assertEquals("Brass", trombone.getMaterial());
    }

    @Test
    public void instrumentHasColour(){
        assertEquals("Silver", trombone.getColour());
    }

    @Test
    public void instrumentHasBuyPrice(){
        assertEquals(180, trombone.getBuyPrice());
    }

    @Test
    public void instrumentHasSellPrice(){
        assertEquals(225, trombone.getSellPrice());
    }

    @Test
    public void tromboneHasType(){
        assertEquals(TromboneType.BASE, trombone.getTromboneType());
    }

    @Test
    public void tromboneCanChangeType(){
        trombone.setTromboneType(TromboneType.SOPRANO);
        assertEquals(TromboneType.SOPRANO, trombone.getTromboneType());
    }

    @Test
    public void canRefurbishTrombone(){
        assertEquals("The trombone has been refurbished.", trombone.refurbish());
    }

    @Test
    public void canTuneTrombone(){
        assertEquals("The trombone has been tuned.", trombone.tuneInstrument());
    }
}
