package org.vaibhav.Discounts;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class CouponDiscount {
    private static final Map<String, Double> discounts = new HashMap<>(Map.of(
            "SAVE500", 500.0,
            "WELCOME10", 10.0,
            "FESTIVE20", 20.0
    ));

    public static double getDiscount(String s){
        if(discounts.get(s) != null){
            return discounts.get(s);
        }else throw new IllegalArgumentException();
    }
}
