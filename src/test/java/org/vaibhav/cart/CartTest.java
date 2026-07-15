package org.vaibhav.cart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CartTest {
    Cart cart;
    @BeforeEach
    void set(){
        cart = new Cart();
    }
    @Test
    void ShouldAddSingleItemToCart(){
        cart.addItem(new Item("pc",50000));
        assertThat(cart.getItems().getFirst().getName()).isEqualTo("pc");
    }
    @Test
    void ShouldAddMultipleItemsToCart(){
        Item a = new Item("Laptop",60000);
        Item b = new Item("Mobile", 30000);
        cart.addItem(a);
        cart.addItem(b);

        assertThat(cart.getItems()).containsExactly(a,b);
    }
    @Test
    void ShouldNotCrashForEmptyCart(){

        assertThat(cart.getItems()).isEmpty();
    }
    @Test
    void ShouldReturnZeroSubTotalForEmptyCart(){
        assertThat(cart.getSubTotal()).isEqualTo(0);
    }


}
