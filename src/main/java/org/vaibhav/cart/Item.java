package org.vaibhav.cart;

public class Item {
    String name;
    int price;

    public Item(String name, int price){
        this.name = name;
        if(price > 0) this.price = price;
        else throw new IllegalArgumentException();
    }
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
}
