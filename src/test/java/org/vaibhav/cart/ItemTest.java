package org.vaibhav.cart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ItemTest {

    @Test
    void ShouldNotAcceptNegativePrice(){
        assertThrows(
                IllegalArgumentException.class,
                () ->  new Item("mobile",-20)
        );
    }

}
