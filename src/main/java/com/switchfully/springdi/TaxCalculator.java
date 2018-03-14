package com.switchfully.springdi;

import com.switchfully.springdi.taxByCountry.TaxCalculation;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;
import javax.inject.Named;
import java.math.BigDecimal;

@Named
public class TaxCalculator {

    private TaxCalculation taxCalculation;

    @Inject
    public TaxCalculator(@Qualifier("AmericanTax") TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }

    public BigDecimal calculateTaxesOnYearIncome(BigDecimal yearIncome) {
        return taxCalculation.calculateTax(yearIncome);
    }

}
