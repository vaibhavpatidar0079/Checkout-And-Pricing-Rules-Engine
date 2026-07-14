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

        return sc.nextInt();
    }
    private static int takeAgeInput(){
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();

    }
    public static User makeUser(){
        //name
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        //age
        int age = takeAgeInput();
        while(age <= 0){
            System.out.println("Age can't be 0 or negative");
            age = takeAgeInput();
        }

        //type
        int typeInput = takeTypeInput();

        while(typeInput < 1 || typeInput > 3 ) { //input start from 1 but in DataBase it start from 0
            System.out.println("-".repeat(60));
            System.out.println("Type can only be 1, 2 and 3");
            System.out.println("-".repeat(60));
            typeInput = takeTypeInput();
        }

        User u = new User(name, typeInput - 1);

        System.out.println("-".repeat(60));
        System.out.println("account created");
        System.out.println("Name: "+ u.getName());
        System.out.println("Account type: "+ u.getType());
        System.out.println("-".repeat(60));

        return new User(name, typeInput);

    }
}
