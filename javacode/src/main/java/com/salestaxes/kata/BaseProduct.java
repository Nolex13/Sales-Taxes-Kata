package com.salestaxes.kata;

import com.salestaxes.kata.interfaces.IProduct;

public class BaseProduct implements IProduct {
    protected Integer quantity = 0;
    protected String name = "Unknown";
    protected Integer price = 0;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setPrice(float price) {
        this.price = (int) (price*100);
    }

    public float getTax() {
        return 0.0f;
    }
}
