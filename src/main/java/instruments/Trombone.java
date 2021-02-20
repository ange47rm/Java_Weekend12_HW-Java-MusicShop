package instruments;

public class Trombone extends Instrument{

    private TromboneType type;

    public Trombone(InstrumentType family, String material, String colour, int buyPrice, int sellPrice, TromboneType type){
        super (family, material, colour, buyPrice, sellPrice);
        this.type = type;
    }

    public String refurbish(){
        return "The trombone has been refurbished.";
    }

    public String tuneInstrument(){
        return "The trombone has been tuned.";
    }

    public TromboneType getTromboneType() {
        return this.type;
    }

    public void setTromboneType(TromboneType type) {
        this.type = type;
    }
}
