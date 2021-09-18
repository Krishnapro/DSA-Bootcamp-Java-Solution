package ConditionAndLoops;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter principle:");
        int p = in.nextInt();

        System.out.print("Enter Time:");
        int t = in.nextInt();

        System.out.print("Enter rate: ");
        int r = in.nextInt();

        int simpleInterest = (p*r*t)/100;

        System.out.print(simpleInterest);

    }
}
