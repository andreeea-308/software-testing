package org.example.shop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;



class CartTest {
    @Test
    public void givenCart_whenAddPrudactWithQuantity_thenExpectedToBeInItemsList(){
        Cart cart = new Cart();
        Product product = new Product("Keyboard", 120);
        cart.add(product, 2);
        Assertions.assertThat(cart.getItems()).isNotEmpty();
        Assertions.assertThat(cart.getItems()).hasSize(1);

        CartItem expectedCartItem = cart.getItems().get(0);
        Assertions.assertThat(expectedCartItem.getProduct()).isEqualTo(product);
        Assertions.assertThat(expectedCartItem.getQuantity()).isEqualTo(2);

    }
}