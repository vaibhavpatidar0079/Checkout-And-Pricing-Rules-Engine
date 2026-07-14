package org.vaibhav.cart;

import java.util.ArrayList;
import java.util.List;


public class Cart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item i){
        items.add(i);
    }
    public List<Item> getItems() {
        return items;
    }

}
