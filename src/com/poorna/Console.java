package com.poorna;

import java.util.Scanner;

public class Console {

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
}
