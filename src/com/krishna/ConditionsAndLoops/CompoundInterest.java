package com.krishna.ConditionsAndLoops;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter principal: ");
        double principal = in.nextDouble();
        System.out.println("Enter rate: ");
        double rate = in.nextDouble();
        rate /= 100;
        System.out.println("Enter time: ");
        double time = in.nextDouble();
        System.out.println("Enter n : ");
        double n = in.nextDouble();

        double CI = principal * Math.pow((1+rate/n), n*time);
        System.out.println(CI);

    }
}
