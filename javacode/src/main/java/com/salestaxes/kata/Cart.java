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
}
