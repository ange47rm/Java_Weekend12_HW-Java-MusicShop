package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements ISell, IPlay {

    private InstrumentType family;
    private String material;
    private String colour;
    private int buyPrice;
    private int sellPrice;

    public Instrument(InstrumentType family, String material, String colour, int buyPrice, int sellPrice) {
        this.family = family;
        this.material = material;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public int calculateMarkup(){
        return getSellPrice() - getBuyPrice();
    };

    public String play(){
        return "*MUSIC*";
    }

    public String refurbish(){
        return "The instrument has been refurbished.";
    }

    public String tuneInstrument(){
        return "The instrument has been tuned.";
    }

    public InstrumentType getFamily() {
        return this.family;
    }

    public void setFamily(InstrumentType family) {
        this.family = family;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getBuyPrice() {
        return this.buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getSellPrice() {
        return this.sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }
}
