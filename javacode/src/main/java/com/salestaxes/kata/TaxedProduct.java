package com.salestaxes.kata;

public class TaxedProduct extends BaseProduct{

    @Override
    public float getTax() {
        return (getPrice() / 10) + getImportTax();
    }
}