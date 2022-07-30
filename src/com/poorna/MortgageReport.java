package com.poorna;

import java.text.NumberFormat;
import java.util.Locale;

public class MortgageReport {

    private MortgageCalculator calculator;
    private final NumberFormat currency;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance(Locale.US);
    }
    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println("Mortgage");
        System.out.println("---------");
        System.out.println("Monthly Payment : " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("Payment schedule");
        System.out.println("----------------");

        for(double balance: calculator.getRemainingBalance())
            System.out.println(currency.format(balance));

    }
}
