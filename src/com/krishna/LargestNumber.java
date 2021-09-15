package com.krishna;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter First No. ");
        int a = in.nextInt();

        System.out.println("Enter second No. ");
        int b = in.nextInt();
        if (a > b){
            System.out.println(a+ "Largest no.");
        }
        else {
            System.out.println(b + "Largest no. ");
        }
    }
}
