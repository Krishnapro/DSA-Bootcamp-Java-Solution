package com.krishna.ConditionsAndLoops;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter base and height: ");
        float b = in.nextFloat();
        float h = in.nextFloat();

        float area = (b*h) / 2;

        System.out.println(area);
    }
}
