package org.vaibhav.cart;

import org.vaibhav.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.vaibhav.Menu.makeCart;

public class Cart {
    List<Item> itemsOption = new ArrayList<>(List.of(
            new Item("Laptop",60000),
            new Item("Mobile",20000),
            new Item("Tablet",30000),
            new Item("Watch",5000)
    ));

    List<Item> items = new ArrayList<>();

    public Cart(){
        this.items = makeCart(this.itemsOption);

        for(Item i : items){
            System.out.println(i.getName());
        }
    }

    public List<Item> getItems() {
        return items;
    }
}
