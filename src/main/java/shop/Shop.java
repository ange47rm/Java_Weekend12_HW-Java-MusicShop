package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<ISell>();
    }

    public void addItemToStock(ISell item){
        this.stock.add(item);
    }

    public void removeItemFromStock(ISell item){
        int itemToRemove = this.stock.indexOf(item);
        this.stock.remove(itemToRemove);
    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public int getItemInStockCount(){
        return this.stock.size();
    }
}
