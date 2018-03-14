package com.switchfully.springdi.taxByCountry;

import org.springframework.context.annotation.Primary;

import javax.inject.Named;
import java.math.BigDecimal;


@Named("BelgianTax")
public class BelgianTaxCalc implements TaxCalculation {

    @Override
    public BigDecimal calculateTax(BigDecimal yearIncome) {
        return yearIncome.multiply(BigDecimal.valueOf(0.45));
    }
}
