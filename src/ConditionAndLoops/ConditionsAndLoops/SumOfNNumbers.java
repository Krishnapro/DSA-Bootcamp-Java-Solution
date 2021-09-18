package ConditionAndLoops.ConditionsAndLoops;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no: ");
        int no = in.nextInt();
        int sum = 0;
         for (int i = 1 ; i <= no; i++) {
             int num = in.nextInt();
             sum += num;
        }
        System.out.println(sum);
    }
}
