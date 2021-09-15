package com.krishna.ConditionsAndLoops;

import java.util.Scanner;

public class CalculateLCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two no: ");
        long a = in.nextLong();
        long b = in.nextLong();
        long gcf = 1;
        for (int i = 1; i <=a && i<=b ; i++) {
            if(a % i == 0 && b%i == 0){
                gcf = i;
            }

        }
        System.out.println("gcf=" +gcf);
        long lcm = a * b / gcf;
        System.out.println("lcm=" + lcm);
    }
}
