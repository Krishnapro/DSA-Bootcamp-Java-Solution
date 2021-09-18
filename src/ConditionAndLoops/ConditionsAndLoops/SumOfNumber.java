package ConditionAndLoops.ConditionsAndLoops;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while (n!=0){
            sum +=n;
            n=in.nextInt();
        }
        System.out.println(sum);
    }
}
