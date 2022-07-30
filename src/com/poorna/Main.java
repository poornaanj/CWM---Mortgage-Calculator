package com.poorna;

public class Main {


    public static void main(String[] args) {

        int principal = (int)Console.readingInput("Enter the amount",100000,10000000);
        float annualInterest = (float)Console.readingInput("Enter the annual interest rate",0,20);
        short period = (short)Console.readingInput("Enter the no of years",5,30);

        Print.printMortgage(principal, annualInterest, period);

        Print.printPaymentSchedule(principal, annualInterest, period);


    }

}
