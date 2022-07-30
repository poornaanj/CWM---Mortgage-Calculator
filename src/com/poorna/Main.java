package com.poorna;

public class Main {

    public static void main(String[] args) {

        int principal = (int) Console.readingInput("Enter the amount",100000,10000000);
        float annualInterest = (float) Console.readingInput("Enter the annual interest rate",1,20);
        short period = (short) Console.readingInput("Enter the no of years",5,30);

        var calculator =  new MortgageCalculator(principal,annualInterest,period);
        var report = new MortgageReport(calculator);

        report.printMortgage();
        report.printPaymentSchedule();

    }

}
