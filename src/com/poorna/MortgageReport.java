package com.poorna;

import java.text.NumberFormat;
import java.util.Locale;

public class MortgageReport {

    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }
    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);
        System.out.println("Mortgage");
        System.out.println("---------");
        System.out.println("Monthly Payment : " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("Payment schedule");
        System.out.println("----------------");

        for(double balance: calculator.getRemainingBalance())
            System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(balance));

    }
}
