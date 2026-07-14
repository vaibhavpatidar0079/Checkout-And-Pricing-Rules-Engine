package org.vaibhav.Menu;

import org.vaibhav.User;
import org.vaibhav.cart.Cart;
import org.vaibhav.cart.Item;
import org.vaibhav.cart.Stock;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CartMenu {
    private static String[] TakeCartInput(){
        Scanner sc  = new Scanner(System.in);
        String inputString = sc.nextLine();
        return inputString.split(" ");
    }

    private static List<Item> AddToCart(String[] input, List<Item> itemsOption){

        List<Item> itemList = new ArrayList<>();

        for(String i: input){
            int inx = Integer.parseInt(i);
            if(inx >= 1 && inx <= itemsOption.size()){
                itemList.add(itemsOption.get(inx - 1));
            }else{
                return List.of();
            }
        }
        return itemList;

    }

    public static void makeCart(User user) {
        Cart cart = new Cart();

        List<Item> itemsOption = Stock.getItemsOption();
        List<Item> itemList = new ArrayList<>();

        System.out.println("-".repeat(60));

        while(itemList.isEmpty()){

            System.out.println("Choose item(s) (multiple inputs allowed sepreted by comma):");
            for(int inx = 0;inx < itemsOption.size(); inx++){
                System.out.println(inx+1 + ". " + itemsOption.get(inx).getName() + ": " + itemsOption.get(inx).getPrice());
            }

            itemList = AddToCart(TakeCartInput(),itemsOption);

            if(itemList.isEmpty()){
                System.out.println("-".repeat(60));
                System.out.println("enter valid number");
                System.out.println("-".repeat(60));
            }
        }
        System.out.println("-".repeat(60));

        for(Item i: itemList){
            cart.addItem(i);
        }

        user.setCart(cart);

        System.out.println("Items added to cart: ");
        for(Item i: user.getCart().getItems()){
            System.out.println(i.getName() + ": " + i.getPrice());
        }
        System.out.println("Your subtotal is: " + user.getCart().getSubTotal());
    }
}
