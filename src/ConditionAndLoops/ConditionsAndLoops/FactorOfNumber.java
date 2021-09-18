package ConditionAndLoops.ConditionsAndLoops;

import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = in.nextInt();
        for (int fact = 1; fact <= num; fact++) {
            if (num % fact == 0){
                System.out.print(fact + " ");
            }

        }


    }
}
