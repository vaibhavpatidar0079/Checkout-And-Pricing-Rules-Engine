package org.vaibhav.cart;

public class Item {
    String name;
    int price;

    Item(String name, int price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
}
