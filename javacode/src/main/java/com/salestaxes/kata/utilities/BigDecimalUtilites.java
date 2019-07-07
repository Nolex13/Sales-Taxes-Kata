package com.salestaxes.kata.utilities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalUtilites {
    public static BigDecimal round(BigDecimal value) {
        BigDecimal increment = new BigDecimal("0.05");
        BigDecimal divided = value.divide(increment, 0, RoundingMode.UP);
        BigDecimal result = divided.multiply(increment);
        return result;
    }
}
