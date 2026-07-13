package org.vaibhav;

public class User {
    String name;
    int type; //0 = regular, 1 = silver, 3 = gold

    User(String name, int type){
        this.name = name;
        this.type = type;
    }

    String getType(){
        return switch (type){
            case 0 ->  "Regular";
            case 1->  "Silver";
            case 2->  "Gold";
            default -> null;
        };
    }
}
