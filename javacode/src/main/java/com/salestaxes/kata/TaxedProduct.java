package com.salestaxes.kata;

public class TaxedProduct extends BaseProduct{
    protected Integer quantity = 0;
    protected String name = "Unknown";
    protected Integer price = 0;

    @Override
    public float getTax() {
        //TODO Round
        return quantity*price/10;
    }
}