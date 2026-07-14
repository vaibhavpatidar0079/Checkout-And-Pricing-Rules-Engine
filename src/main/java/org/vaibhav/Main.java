 package org.vaibhav;

import org.vaibhav.Menu.CartMenu;
import org.vaibhav.Menu.UserMenu;
import org.vaibhav.cart.Cart;
import org.vaibhav.cart.Item;

import java.util.List;


public class Main {
    static void main() {
        User user = UserMenu.makeUser();
        CartMenu.makeCart(user);
    }
}
