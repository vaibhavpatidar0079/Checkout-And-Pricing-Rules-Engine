package org.vaibhav;

import java.util.Scanner;

public class Menu {
    static User makeUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("customer type:");
        System.out.println("1. Regular");
        System.out.println("2. Silver");
        System.out.println("3. Gole");
        System.out.println("Enter no. ");
        int type = sc.nextInt();

        return new User(name, type);

    }
    static void printMenuType(){

    }

}
