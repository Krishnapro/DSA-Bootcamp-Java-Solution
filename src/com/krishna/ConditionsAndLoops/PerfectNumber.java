package com.krishna.ConditionsAndLoops;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no: ");
        int num = in.nextInt();
        System.out.print("Enter perfect number: ");
        int perfectNumber = in.nextInt();
        int rem=0;
        while (num != 0){
             rem = num % 10;
            num = num / 10;
            if (rem == perfectNumber){
                System.out.println("perfect=" +rem);
            }
        }
    }
}
