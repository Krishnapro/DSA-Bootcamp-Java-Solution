package ConditionAndLoops.ConditionsAndLoops;

import java.util.Scanner;

public class AverageOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        float sum = 0;
        float Average = 0;
        float n = in.nextFloat();
        for (float i = 1 ; i <= n; i++) {
                float num = in.nextFloat();
            sum +=num;

        }
        System.out.println(sum/n);
    }
}
