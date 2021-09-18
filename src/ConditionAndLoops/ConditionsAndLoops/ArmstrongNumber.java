package ConditionAndLoops.ConditionsAndLoops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no for armstrong no:");
        int sum = 0;
        int num = in.nextInt();
        int check = num;
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num = num / 10;
        }
        if (sum == check){
            System.out.println("Armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }
}
