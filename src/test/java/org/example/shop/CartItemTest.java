package org.example.shop;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CartItemTest {
    @Test
    public void getPrice_whenProdactPriceIs120AndQuantityIs2_thenReturn240(){
        Product product = new Product("Keyboard", 120);
        CartItem cartItem = new CartItem(product, 2);
        Assertions.assertThat(cartItem.getPrice()).isEqualTo(240);
    }

}