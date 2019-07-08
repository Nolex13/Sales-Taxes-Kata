package com.salestaxes.kata;

import com.salestaxes.kata.interfaces.IProduct;
import com.salestaxes.kata.utilities.BigDecimalUtilites;

import java.math.BigDecimal;

public class BaseProduct implements IProduct {
    protected Integer quantity = 0;
    protected String name = "Unknown";
    protected BigDecimal price = new BigDecimal("0.00");
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

    public void setAsImported(boolean imported) {
        this.imported = imported;
    }

    public boolean isImported() {
        return imported;
    }

    public BigDecimal getFinalPrice() {
        return getPrice().add(getTax());
    }

    public BigDecimal getPrice() {
        return price.multiply(new BigDecimal(quantity));
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setPrice(String price) {
        this.price = new BigDecimal(price);
    }

    public BigDecimal getTax() {
        return BigDecimalUtilites.round(getImportTax());
    }

    protected BigDecimal getImportTax(){
        if(imported)return getPrice().multiply(new BigDecimal("0.05"));
        return new BigDecimal("0.00");
    }
}
