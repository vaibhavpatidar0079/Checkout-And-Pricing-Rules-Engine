package org.vaibhav.cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


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

    public Optional<Item> contains(String name){
        for(Item i: items){
            if(i.getName().equals(name)) return Optional.of(i);
        }
        return Optional.empty();
    }

}
