package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(InstrumentType.STRING, "Wood", "Ebony", 220, 295, 5, GuitarType.ACOUSTIC);
    }

    @Test
    public void instrumentHasType(){
        assertEquals(InstrumentType.STRING, guitar.getFamily());
    }

    @Test
    public void instrumentHasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void instrumentHasColour(){
        assertEquals("Ebony", guitar.getColour());
    }

    @Test
    public void instrumentHasBuyPrice(){
        assertEquals(220, guitar.getBuyPrice());
    }

    @Test
    public void instrumentHasSellPrice(){
        assertEquals(295, guitar.getSellPrice());
    }

    @Test
    public void guitarHasNumberOfStrings(){
        assertEquals(5, guitar.getNumberOfStrings());
    }

    @Test
    public void guitarHasType(){
        assertEquals(GuitarType.ACOUSTIC, guitar.getGuitarType());
    }

    @Test
    public void guitarCanChangeType(){
        guitar.setGuitarType(GuitarType.ELECTRIC);
        assertEquals(GuitarType.ELECTRIC, guitar.getGuitarType());
    }

    @Test
    public void canRefurbishGuitar(){
        assertEquals("The guitar has been refurbished.", guitar.refurbish());
    }

    @Test
    public void canTuneGuitar(){
        assertEquals("The guitar has been tuned.", guitar.tuneInstrument());
    }
}
