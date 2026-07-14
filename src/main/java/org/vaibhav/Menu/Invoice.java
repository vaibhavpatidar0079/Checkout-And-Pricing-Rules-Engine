package org.vaibhav.Menu;

import java.util.Map;

public class Invoice {
    public static void makeInvoice(Map<String,Double> invoice, double subTotal){
        Double total = 0.0;

        System.out.println("-".repeat(60));
        System.out.println(subTotal);
        System.out.println("-".repeat(60));

        for(Map.Entry<String,Double> i:invoice.entrySet()){
            System.out.println(i.getKey() + " : " + i.getValue());
            total += i.getValue();
        }
        System.out.println("-".repeat(60));
        System.out.println("Total: " + total);
        System.out.println("-".repeat(60));
    }
}
