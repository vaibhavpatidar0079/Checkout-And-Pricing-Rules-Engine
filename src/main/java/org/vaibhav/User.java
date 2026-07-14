package org.vaibhav;

import org.vaibhav.cart.Cart;

public class User {
    private String name;
    private int age;
    private int type; //0 = regular, 1 = silver, 3 = gold
    private Cart cart;

    public User(String name, int type){
        this.name = name;
        this.type = type;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return switch (type){
            case 0 ->  "Regular";
            case 1->  "Silver";
            case 2->  "Gold";
            default -> null;
        };
    }
    public void setName(String name){
        if(!name.isEmpty()) this.name = name;
        else{
            throw new IllegalArgumentException();
        }
    }
    public void setType(int type){
        if(type < 0 || type > 2){
            throw new IllegalArgumentException();
        }
        this.type = type;
    }
    public Cart getCart(){
        return cart;
    }

    public void setCart(Cart cart){
        this.cart = cart;
    }
    public void setAge(int age){
        if(age > 0) this.age = age;
        else throw new IllegalArgumentException();
    }
    public int getAge(){
        return age;
    }
}
