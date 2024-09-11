package org.example.shop;

/**
 * This class will have 2 fields:
 * - 'product' of type Product
 * - 'quantity' of type int
 * <p>
 * Generate getters, setters, constructors.
 * <p>
 * Create a method called 'getPrice' that returns an 'int' and calculate the price of this item (multiply product's price with the quantity)
 * Write unit tests for this method.
 */
public class CartItem {

    private Product product;
    private int quantity;

    public CartItem() {
    }

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice(){
        return product.getPrice() * this.quantity;
    }
}
