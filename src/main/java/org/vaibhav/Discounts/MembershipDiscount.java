package org.vaibhav.Discounts;

import org.vaibhav.User;

public class MembershipDiscount {
    static double regularDiscount = 0.0/100;
    static double silverDiscount = 5.0/100;
    static double goldDiscount = 10.0/100;

    public static double applyMembershipDiscount(User user, int cost){
        if(user.getType().equals("silver")){
            return cost * silverDiscount;
        }else if(user.getType().equals("Gold")){
            return cost * goldDiscount;
        }else{
            return cost * regularDiscount;
        }
    }
}
