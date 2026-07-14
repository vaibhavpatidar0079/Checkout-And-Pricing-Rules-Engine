package org.vaibhav.Menu;

import org.vaibhav.Discounts.CouponDiscount;
import org.vaibhav.User;
import org.vaibhav.cart.Item;

import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class CheckoutMenu {
    public static void makeCheckout(){
        System.out.println("checkout initialized");
    }
    private static int haveCoupon(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DO you have COUPON?");
        System.out.println("1. YES");
        System.out.println("2. NO");
        return sc.nextInt();
    }


    private static String takeCouponInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Coupon: ");
        return sc.nextLine();
    }

    public static Optional<String> ifApplyCoupon(){
        System.out.println("-".repeat(60));
        int haveCouponInput = 0;

        while(haveCouponInput != 1 && haveCouponInput != 2){
            haveCouponInput = haveCoupon();
            if(haveCouponInput !=1 && haveCouponInput != 2) {
                System.out.println("Only valid Input are 1 and 2");
            }
        }

        while(haveCouponInput == 1){
            String coupon = takeCouponInput();
           if(CouponDiscount.isValid(coupon)){
               System.out.println("-".repeat(60));
               return Optional.of(coupon);
           }
            System.out.println("Invalid COUPON");
        }
        System.out.println("-".repeat(60));
        return Optional.empty();
    }
    public static int NeedWarranty(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. YES");
        System.out.println("2. NO");

        return sc.nextInt();

    }

    public static boolean IfExtendedWarranty(Item item,Double price){
        System.out.println("-".repeat(60));
        System.out.println("Do you want to add Extended Warranty on " + item.getName() +" for " + price);

        int need = 0;
        while(need != 1 && need != 2){
            need = NeedWarranty();
            if(need != 1 && need != 2){
                System.out.println("Only valid Input are 1 and 2");
            }
        }
        System.out.println("-".repeat(60));
        return need == 1;

    }

}

