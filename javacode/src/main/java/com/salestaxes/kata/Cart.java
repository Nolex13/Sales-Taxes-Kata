package com.salestaxes.kata;

import com.salestaxes.kata.interfaces.IProduct;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<IProduct> products = new ArrayList<>();

    public void add(IProduct product){
        products.add(product);
    }

    public float getTotalTaxes(){
        float result = 0;
        for(IProduct product: products){
            result += product.getTax();
        }
        return result;
    }

    public float getTotal(){
        float result = 0;
        for(IProduct product: products){
            result += product.getPrice() + product.getTax();
        }
        return result;
    }
}
