package org.vaibhav.Discounts;

public class ShippingDiscount {
    private static double discountAmount = 500;
    private static double minimumAmount = 5000;

    public static double applyShippingDiscount(double cost){
        if(cost >= minimumAmount){
            return cost - discountAmount;
        }
        return cost;
    }

    public double getDiscountAmount() {
        return minimumAmount;
    }
    public double getMinimumAmount(){
        return discountAmount;
    }
}
