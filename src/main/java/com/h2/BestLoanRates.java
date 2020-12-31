package com.h2;

import java.util.Map;
import java.util.Scanner;

public class BestLoanRates {

    public static final Map<Integer, Float> bestRates = Map.of(1,5.50f, 2, 3.45f, 3, 2.67f);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        Integer loanTermInYears;
        Float bestRate;
        System.out.println("Enter your name");
        name = scanner.nextLine();
        System.out.printf("Hello %s%n", name);
        System.out.println("Enter the loan term (in years)");
        loanTermInYears = scanner.nextInt();
        bestRate = getRates(loanTermInYears);
        if(bestRate < Float.MIN_NORMAL){
            System.out.println("No available rates for term: " + loanTermInYears + " years");
        }
        else {
            System.out.println("Best Available Rate: " + bestRate + "%");
        }
        scanner.close();
    }

    public static float getRates(int loanTermInYears){
         if (bestRates.containsKey(loanTermInYears)){
             return bestRates.get(loanTermInYears);
         } else
        return 0.0f;
    }



}
