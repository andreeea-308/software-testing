package org.example.shop;

import java.util.ArrayList;
import java.util.List;

/**
 * This class works as a shopping cart. We can:
 *  - add product
 *  - remove product
 *  - get cart price (sum of all items)
 *  - (optional) check if a product exist in cart
 *  - (optional) get quantity of a product
 *  - (optional) decrease quantity of product
 *
 *  Tips to consider while implementing:
 *
 *  1. this class have a field called 'items' of type 'List<CartItem>' that contains all items from cart
 *    - initialize this list as an empty list
 *
 *  2. create a method called 'add' that receives as parameters a Product and the quantity
 *    - in this method instantiate an object CartItem using parameters and add it to 'items'
 *
 *  3. create a method called 'remove' that receives as parameter a Product
 *    - in this method check if product exits in items list and remove it, else thrown an exception to highlight that product to remove is not in cart
 *
 *  4. create a method called 'getTotalPrice' that returns an 'int' representing total price for all items in cart
 *    - how to implement this method?
 *
 *  For each method created above write unit tests to assuring their expected behavior
 *   - when call 'add(product)' then 'product' should be in the items list
 *   - when call 'remove(product)' then item list should not contain 'product'
 *   - what other scenarios can be tested?
 *
 */
public class Cart {
    private List<CartItem> items;

    public Cart() {
        this.items = new ArrayList<>(0);
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void add(Product product, int quantity){
        CartItem cartItem = new CartItem(product, quantity);
        items.add(cartItem);
    }

    public void remove(Product product) throws {
        CartItem cartItem = new CartItem(product, 1);
        items.remove(cartItem);
    }
}
