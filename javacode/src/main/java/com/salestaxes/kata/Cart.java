package com.salestaxes.kata;

import com.salestaxes.kata.interfaces.IProduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<IProduct> products = new ArrayList<>();

    public void add(IProduct product){
        products.add(product);
    }

    public BigDecimal getTotalTaxes(){
        BigDecimal result = new BigDecimal("0.00");
        for(IProduct product: products){
            result = result.add(product.getTax());
        }
        return result;
    }

    public BigDecimal getTotal(){
        BigDecimal result = new BigDecimal("0.00");
        for(IProduct product: products){
            result = result.add(product.getFinalPrice());
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for(IProduct product: products){
            result += product.getQuantity() + " "
                    + (product.isImported() ? "imported " : "")
                    + product.getName() + ": "
                    + product.getFinalPrice() + "\n";
        }
        result += "Sales Taxes: " + getTotalTaxes() + "\n";
        result += "Total: " + getTotal();

        return result;
    }
}
