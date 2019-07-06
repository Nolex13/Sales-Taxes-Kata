package com.salestaxes.kata;

import com.salestaxes.kata.interfaces.IProduct;

public class BaseProduct implements IProduct {
    protected Integer quantity = 0;
    protected String name = "Unknown";
    protected Integer price = 0;
    protected boolean imported = false;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setAsImported(boolean imported) {
        this.imported = imported;
    }

    public float getPrice() {
        return ((float)(price * quantity)/100);
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setPrice(float price) {
        this.price = (int) (price*100);
    }

    public float getTax() {
        return getImportTax();
    }

    protected float getImportTax(){
        if(imported) return (getPrice()*5/100);
        return 0.0f;
    }
}
