package instruments;

public class Guitar extends Instrument{

    private int numberOfStrings;
    private GuitarType type;

    public Guitar (InstrumentType family, String material, String colour, int buyPrice, int sellPrice, int numberOfStrings, GuitarType type){
        super(family, material, colour, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
        this.type = type;
    }

    public int getNumberOfStrings(){
        return this.numberOfStrings;
    }

    public GuitarType getGuitarType(){
        return this.type;
    }

    public void setGuitarType(GuitarType type){
        this.type = type;
    }

    public String refurbish(){
        return "The guitar has been refurbished.";
    }

    public String tuneInstrument(){
        return "The guitar has been tuned.";
    }



}
