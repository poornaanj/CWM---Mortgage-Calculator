package com.poorna;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final byte MONTHS_PER_YEAR = 12;
        final byte PERCENT = 100;
        float monthlyInterest;
        int noOfPayments;
        double mortgage;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal : ");
        int principal = scanner.nextInt();

        System.out.print("Annual interest rate : ");
        float annualInterest = scanner.nextFloat();

        System.out.print("Period (Years) : ");
        byte period = scanner.nextByte();

        monthlyInterest = annualInterest/MONTHS_PER_YEAR/PERCENT;
        noOfPayments = period*MONTHS_PER_YEAR;


        mortgage = principal*(monthlyInterest*Math.pow((1+monthlyInterest),noOfPayments))/(Math.pow((1+monthlyInterest),noOfPayments)-1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);

        System.out.println("Mortgage : "+ mortgageFormatted);

        //input validation

    }
}
