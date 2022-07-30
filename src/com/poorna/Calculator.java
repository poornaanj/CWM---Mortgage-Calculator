package com.poorna;

public class Calculator {

    private static final byte MONTHS_PER_YEAR = 12;
    private static final byte PERCENT = 100;

    public static double calculateMortgage(int principal,float annualInterest,short period){

        float monthlyInterest = annualInterest/MONTHS_PER_YEAR/PERCENT;
        int noOfPayments = period*MONTHS_PER_YEAR;

        return  principal*(monthlyInterest*Math.pow((1+monthlyInterest),noOfPayments))/(Math.pow((1+monthlyInterest),noOfPayments)-1);
    }

    public static double calculateBalance(int principal, float annualInterest, short period, short numberOfPaymentsMade){

        float monthlyInterest = annualInterest/MONTHS_PER_YEAR/PERCENT;
        int noOfPayments = period*MONTHS_PER_YEAR;

        return principal*(Math.pow((1+monthlyInterest),noOfPayments)-Math.pow((1+monthlyInterest),numberOfPaymentsMade))/(Math.pow((1+monthlyInterest),noOfPayments)-1);
    }

    public static byte getMonthsPerYear(){
        return MONTHS_PER_YEAR;
    }

}
