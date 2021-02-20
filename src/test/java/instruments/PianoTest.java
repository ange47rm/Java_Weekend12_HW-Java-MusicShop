package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano (InstrumentType.PERCUSSION, "Cast iron",  "Black", 1799, 2350, PianoType.UPRIGHT);
    }

    @Test
    public void instrumentHasType(){
        assertEquals(InstrumentType.PERCUSSION, piano.getFamily());
    }

    @Test
    public void instrumentHasMaterial(){
        assertEquals("Cast iron", piano.getMaterial());
    }

    @Test
    public void instrumentHasColour(){
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void instrumentHasBuyPrice(){
        assertEquals(1799, piano.getBuyPrice());
    }

    @Test
    public void instrumentHasSellPrice(){
        assertEquals(2350, piano.getSellPrice());
    }

    @Test
    public void instrumentCanBePlayed(){
        assertEquals("*MUSIC*", piano.play());
    }

    @Test
    public void canCalculateInstrumentMarkup(){
        assertEquals(551, piano.calculateMarkup());
    }

    @Test
    public void pianoHasType(){
        assertEquals(PianoType.UPRIGHT, piano.getPianoType());
    }

    @Test
    public void pianoCanChangeType(){
        piano.setPianoType(PianoType.ELECTRIC_PIANO);
        assertEquals(PianoType.ELECTRIC_PIANO, piano.getPianoType());
    }

    @Test
    public void canRefurbishPiano(){
        assertEquals("The piano has been refurbished.", piano.refurbish());
    }

    @Test
    public void canTunePiano(){
        assertEquals("The piano has been tuned.", piano.tuneInstrument());
    }

}
