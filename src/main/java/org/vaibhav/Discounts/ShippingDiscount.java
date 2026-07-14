package org.vaibhav.Discounts;

public class ShippingDiscount {
    private static double discountAmount = 500;
    private static double minimumAmount = 5000;

    public static double getDiscount(double cost){
        if(cost >= minimumAmount){
            return discountAmount;
        }
        return 0;
    }

    public double getDiscountAmount() {
        return minimumAmount;
    }
    public double getMinimumAmount(){
        return discountAmount;
    }
}
