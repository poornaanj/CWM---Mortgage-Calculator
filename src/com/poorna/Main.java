package com.poorna;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int principal = (int)readingInput("Enter the amount",100000,10000000);
        float annualInterest = (float)readingInput("Enter the annual interest rate",0,20);
        short period = (short)readingInput("Enter the no of years",5,30);

        double mortgage = calculateMortgage(principal,annualInterest,period);

        String mortgageFormatted = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);

        System.out.println("Mortgage : "+ mortgageFormatted);

    }

    public static double readingInput(String message,int min, int max){
        double input;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print(message + " : ");
            input = scanner.nextDouble();
            if(input>=min && input<=max)
                break;
            System.out.println("Enter a value between " + min + " & " + max);
        }
        return input;
    }

    public static double calculateMortgage(int principal,float annualInterest,short period){

        final byte MONTHS_PER_YEAR = 12;
        final byte PERCENT = 100;
        float monthlyInterest;
        int noOfPayments;

        monthlyInterest = annualInterest/MONTHS_PER_YEAR/PERCENT;
        noOfPayments = period*MONTHS_PER_YEAR;

        return  principal*(monthlyInterest*Math.pow((1+monthlyInterest),noOfPayments))/(Math.pow((1+monthlyInterest),noOfPayments)-1);
    }
}
