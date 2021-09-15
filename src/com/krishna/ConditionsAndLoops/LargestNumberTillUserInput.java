package com.krishna.ConditionsAndLoops;

import java.util.Scanner;

public class LargestNumberTillUserInput {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner in = new Scanner(System.in);
        int large = 0;
        int n = in.nextInt();

        while (n!=0){
             n = in.nextInt();
            if ( large < n ){
                 large = n;
            }
        }
        System.out.println(large);
    }
}
