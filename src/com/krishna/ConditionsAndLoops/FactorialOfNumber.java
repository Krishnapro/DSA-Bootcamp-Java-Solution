package com.krishna.ConditionsAndLoops;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number for factorial: ");

        int num = in.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;

        }
        System.out.println(fact);
    }
}
