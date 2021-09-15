package com.krishna.ConditionsAndLoops;

import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pv = in.nextDouble();
        double r = in.nextDouble();
        r = r/100;
        double t = in.nextDouble();
        double SISum = 0;
        double FV = pv * Math.pow(1+r,t);
        System.out.println(FV);


    }
}