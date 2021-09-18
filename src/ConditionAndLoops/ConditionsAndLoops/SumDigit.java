package ConditionAndLoops.ConditionsAndLoops;

import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no: ");
        long n = in.nextLong();
        long sum = 0;
        while (n!=0){
            long rem = n % 10;
            sum +=rem;
            n /=10;
        }
        System.out.println("sum of digit of Number= "+sum);
    }
}
