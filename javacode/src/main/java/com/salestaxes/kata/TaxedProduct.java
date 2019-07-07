package com.salestaxes.kata;

import com.salestaxes.kata.utilities.BigDecimalUtilites;

import java.math.BigDecimal;

public class TaxedProduct extends BaseProduct{

    @Override
    public BigDecimal getTax() {
        return BigDecimalUtilites.round(
                getPrice()
                        .multiply(new BigDecimal("0.10"))
                        .add(getImportTax())
        );
    }
}