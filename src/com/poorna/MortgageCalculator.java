package com.poorna;

public class MortgageCalculator {
    private static final byte PERCENT = 100;
    private static final byte MONTHS_PER_YEAR = 12;

    private int principal;
    private float annualInterest;
    private short period;

    public MortgageCalculator(int principal, float annualInterest, short period) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.period = period;
    }

    public double calculateMortgage() {
        float monthlyInterest = getMonthlyInterest();
        int noOfPayments = getNoOfPayments();
        return principal * (monthlyInterest * Math.pow((1 + monthlyInterest), noOfPayments)) / (Math.pow((1 + monthlyInterest), noOfPayments) - 1);
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = getMonthlyInterest();
        int noOfPayments = getNoOfPayments();
        return this.principal * (Math.pow((1 + monthlyInterest), noOfPayments) - Math.pow((1 + monthlyInterest), numberOfPaymentsMade)) / (Math.pow((1 + monthlyInterest), noOfPayments) - 1);
    }

    public double[] getRemainingBalance() {
        var balances = new double[getNoOfPayments()];
        for (short month = 1; month <= getNoOfPayments(); month++) {
            balances[month-1] = calculateBalance(month);
        }
        return balances;
    }

    private float getMonthlyInterest() {
        return annualInterest / MONTHS_PER_YEAR / PERCENT;
    }

    private int getNoOfPayments() {
        return period * MONTHS_PER_YEAR;
    }


}
