package com.salestaxes.kata.interfaces;

public interface IProduct {
    Integer getQuantity();
    void setQuantity(Integer quantity);
    float getPrice();
    void setPrice(Integer price);
    void setPrice(float price);
    float getTax();
    String getName();
    void setAsImported(boolean imported);
}
