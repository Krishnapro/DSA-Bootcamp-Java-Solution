package ConditionAndLoops.ConditionsAndLoops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int count = 2;
        int c ;
        int a = 0;
        int b = 1;


        Scanner in = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = in.nextInt();
        System.out.print(a+ " " + b + " ");
        while (count <= num) {

                c = a + b;
                a = b;
                b = c;
                count++;
                System.out.print(c + " ");
        }

    }
}
