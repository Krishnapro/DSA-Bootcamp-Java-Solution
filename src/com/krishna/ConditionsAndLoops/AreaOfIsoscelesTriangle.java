package com.krishna.ConditionsAndLoops;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        System.out.println("Enter Base and Height: ");
        Scanner in = new Scanner(System.in);
        float b  = in.nextFloat();
        float h = in.nextFloat();

        float area = (b * h) / 2;
        System.out.println(area);
    }
}
