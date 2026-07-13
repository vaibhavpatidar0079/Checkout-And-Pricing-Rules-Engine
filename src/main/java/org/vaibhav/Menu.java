package org.vaibhav;

import org.vaibhav.cart.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static int takeTypeInput(){
        Scanner sc = new Scanner(System.in);

        System.out.println("customer type:");
        System.out.println("1. Regular");
        System.out.println("2. Silver");
        System.out.println("3. Gole");
        System.out.print("Enter no. ");

        return sc.nextInt();
    }

    static User makeUser(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        int typeInput = takeTypeInput();

        while(typeInput < 1 || typeInput > 3 ) { //input start from 1 but in DataBase it start from 0
            System.out.println("-".repeat(60));
            System.out.println("Type can only be 1, 2 and 3");
            System.out.println("-".repeat(60));
            typeInput = takeTypeInput();
        }

        User u = new User(name, typeInput);
        System.out.println("-".repeat(60));
        System.out.println("account created");
        System.out.println("Name: "+ u.name);
        System.out.println("Account type: "+ u.getType());
        System.out.println("-".repeat(60));

        return new User(name, typeInput);

    }
    public static String[] TakeCartInput(){
        Scanner sc  = new Scanner(System.in);
        String inputString = sc.nextLine();
        return inputString.split(" ");
    }

    public static List<Item> AddToCart(String[] input,List<Item> itemsOption){
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

    public static List<Item> makeCart(List<Item> itemsOption) {
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

        return itemList;

    }
}