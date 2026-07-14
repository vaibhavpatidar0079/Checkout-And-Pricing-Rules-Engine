package org.vaibhav.cart;

import java.util.ArrayList;
import java.util.List;


public class Cart {
    private List<Item> items = new ArrayList<>();
    private double subTotal;

    public void addItem(Item i){
        items.add(i);
        subTotal += items.getLast().getPrice();
    }

    public List<Item> getItems() {
        return items;
    }

    public double getSubTotal(){
        return subTotal;
    }

}
