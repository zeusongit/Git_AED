/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Product.Product;

/**
 *
 * @author Ashish
 */
public class OrderItem {
    private int quantity;
    private Product product;  
    
    public OrderItem(Product product) {
        this.product= product;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return product.getProductName();
    }
    
    
}
