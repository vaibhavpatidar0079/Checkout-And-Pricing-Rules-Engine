package org.vaibhav.Menu;

import org.vaibhav.User;

import java.util.Scanner;

public class UserMenu {
    private static int takeTypeInput(){
        Scanner sc = new Scanner(System.in);

        System.out.println("customer type:");
        System.out.println("1. Regular");
        System.out.println("2. Silver");
        System.out.println("3. Gole");
        System.out.print("Enter no. ");

        return sc.nextInt() - 1; //input start from 1 but in DataBase it start from 0
    }
    private static int takeAgeInput(){
        System.out.print("Enter your age:");
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

    public static User makeUser(){
        User user = new User();

        //name
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        user.setName(name);
        System.out.println();

        //age
        while(true){
            try{
                user.setAge(takeAgeInput());
                break;
            }catch (IllegalArgumentException e){
                System.out.println("-".repeat(60));
                System.out.println(e.getMessage());
                System.out.println("-".repeat(60));
            }
        }
        System.out.println();

        //type
        while(true) {
            try{
                user.setType(takeTypeInput());
                break;
            }catch(IllegalArgumentException e){
                System.out.println("-".repeat(60));
                System.out.println(e.getMessage());
                System.out.println("-".repeat(60));
            }
        }
        System.out.println();

        System.out.println("-".repeat(60));
        System.out.println("account created");
        System.out.println("Name: "+ user.getName());
        System.out.println("Account type: "+ user.getType());
        System.out.println("-".repeat(60));

        return user;

    }
}
