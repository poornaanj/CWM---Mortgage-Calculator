package com.poorna;

import java.text.NumberFormat;
import java.util.Locale;

public class Print {

    public static void printMortgage(int principal, float annualInterest, short period) {
        double mortgage = Calculator.calculateMortgage(principal, annualInterest, period);
        String mortgageFormatted = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);
        System.out.println("Mortgage");
        System.out.println("---------");
        System.out.println("Monthly Payment : "+ mortgageFormatted);
    }

    public static void printPaymentSchedule(int principal, float annualInterest, short period) {
        System.out.println();
        System.out.println("Payment schedule");
        System.out.println("----------------");
        for(short month = 1; month<=(period *Calculator.getMonthsPerYear()); month++){
            double remainingBalance = Calculator.calculateBalance(principal, annualInterest, period,month);
            String remainingBalanceFormatted = NumberFormat.getCurrencyInstance(Locale.US).format(remainingBalance);
            System.out.println(remainingBalanceFormatted);
        }
    }
}
