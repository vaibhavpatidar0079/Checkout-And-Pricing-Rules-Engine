package org.vaibhav.cart;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private static List<Item> itemsOption = new ArrayList<>(List.of(
            new Item("Laptop",60000),
            new Item("Mobile",20000),
            new Item("Tablet",30000),
            new Item("Watch",5000),
            new Item("Drink",100)
    ));

    public void add(String name, int price){
        itemsOption.add(new Item(name,price));
    }
    public static List<Item> getItemsOption(){
        return itemsOption;
    }
}
