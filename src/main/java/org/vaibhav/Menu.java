package org.vaibhav;

import java.util.Scanner;

public class Menu {

    static int takeTypeInput(){
        Scanner sc = new Scanner(System.in);

        System.out.println("customer type:");

        System.out.println("1. Regular");
        System.out.println("2. Silver");
        System.out.println("3. Gole");
        System.out.print("Enter no. ");

        int type = sc.nextInt();
        if(type>3 || type<1){
            System.out.println("Type can only be 1, 2 and 3");
            return takeTypeInput();
        }
        return type;
    }

    static User makeUser(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        int type = takeTypeInput() - 1; //input start from 1 but in DataBase it start from 0

        User u = new User(name, type);

        System.out.println("account created");
        System.out.println("Name: "+ u.name);
        System.out.println("Account type: "+ u.getType());

        return new User(name, type);

    }
    static void printMenuType(){

    }


}
