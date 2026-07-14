package org.vaibhav.Checkout;

import org.vaibhav.Discounts.CouponDiscount;
import org.vaibhav.Discounts.MembershipDiscount;
import org.vaibhav.Discounts.ShippingDiscount;
import org.vaibhav.Menu.Invoice;
import org.vaibhav.User;
import org.vaibhav.Menu.CheckoutMenu;
import org.vaibhav.cart.Item;

import java.util.*;

public class Checkout {
    static double cost;
    static Map<String, Double> invoice = new LinkedHashMap<>() {
    };

    public static void doCheckout(User user) {
        cost = user.getCart().getSubTotal();

        Optional<Item> drink = user.getCart().contains("Drink");
        drink.ifPresent(item -> {
            if (user.getAge() < 18) {
                throw new RuntimeException("Energy drink can not be purchased for age less than 18");
            }
        });

        CheckoutMenu.makeCheckout();
        double shippingDiscount = ShippingDiscount.getDiscount(cost);
        cost -= shippingDiscount;
        invoice.put("Shipping Discount", -shippingDiscount);

        boolean appliedCoupon = false;
        Optional<String> coupon = CheckoutMenu.ifApplyCoupon();
        if (coupon.isPresent()) {
            double couponDiscount = CouponDiscount.getDiscount(coupon.get());
            cost -= couponDiscount;
            invoice.put("Coupon discount", -couponDiscount);
            appliedCoupon = true;
        }

        if (!appliedCoupon) {
            double memberDiscount = MembershipDiscount.getDiscount(user);
            cost -= memberDiscount;
            invoice.put("Member Discount", -memberDiscount);
        }

        Optional<Item> laptop = user.getCart().contains("Laptop");
        laptop.ifPresent(item -> {
            if (CheckoutMenu.IfExtendedWarranty(item, 2000.0)) {
                double extendedWarranty = 2000;
                cost += extendedWarranty;
                invoice.put("Extended warranty", 2000.0);
            }
        });

        Invoice.makeInvoice(invoice, user.getCart().getSubTotal());

    }

}


