package shop;

import behaviours.ISell;

public class Accessory implements ISell {

    private String itemName;
    private int buyPrice;
    private int sellPrice;

    public Accessory (String itemName, int buyPrice, int sellPrice){
        this.itemName = itemName;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getAccessoryName() {
        return this.itemName;
    }

    public void setAccessoryName(String itemName) {
        this.itemName = itemName;
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

    public int calculateMarkup(){
        return this.sellPrice - this.buyPrice;
    }
}
