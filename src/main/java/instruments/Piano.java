package instruments;

public class Piano extends Instrument{

    private PianoType type;

    public Piano(InstrumentType family, String material, String colour, int buyPrice, int sellPrice, PianoType type){
        super (family, material, colour, buyPrice, sellPrice);
        this.type = type;
    }

    public String refurbish(){
        return "The piano has been refurbished.";
    }

    public String tuneInstrument(){
        return "The piano has been tuned.";
    }

    public PianoType getPianoType() {
        return this.type;
    }

    public void setPianoType(PianoType type) {
        this.type = type;
    }
}
