package com.salestaxes.kata.interfaces;

import java.math.BigDecimal;

public interface IProduct {
    Integer getQuantity();
    void setQuantity(Integer quantity);
    BigDecimal getPrice();
    void setPrice(BigDecimal price);
    BigDecimal getTax();
    String getName();
    void setAsImported(boolean imported);
    BigDecimal getFinalPrice();
}
