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
        int principal;
        float annualInterest;
        short period;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Principal : ");
            principal = scanner.nextInt();
            if(principal<100000||principal>10000000) {
                System.out.println("Enter a value between 100000 & 10000000");
                continue;
            }
            break;
        }

        while(true){
            System.out.print("Annual interest rate : ");
            annualInterest = scanner.nextFloat();
            if(annualInterest<0||annualInterest>30) {
                System.out.println("Enter a value between 0 & 30");
                continue;
            }
            break;
        }

        while(true){
            System.out.print("Period (Years) : ");
            period = scanner.nextShort();
            if(period<0||period>30) {
                System.out.println("Enter a value between 0 & 30");
                continue;
            }
            break;
        }

        monthlyInterest = annualInterest/MONTHS_PER_YEAR/PERCENT;
        noOfPayments = period*MONTHS_PER_YEAR;

        mortgage = principal*(monthlyInterest*Math.pow((1+monthlyInterest),noOfPayments))/(Math.pow((1+monthlyInterest),noOfPayments)-1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);

        System.out.println("Mortgage : "+ mortgageFormatted);


    }
}
