package com.switchfully.springdi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class TaxApplication implements CommandLineRunner{

    private final ApplicationContext applicationContext ;

    public TaxApplication(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public static void main(String[] args) {
        SpringApplication.run(TaxApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        TaxCalculator taxCalculator = applicationContext.getBean(TaxCalculator.class);
        BigDecimal yearIncome = new BigDecimal(40000);
        System.out.printf("\n\n\nThe tax you have to pay : $ %.2f\n\n\n",taxCalculator.calculateTaxesOnYearIncome(yearIncome).doubleValue());
    }
}
