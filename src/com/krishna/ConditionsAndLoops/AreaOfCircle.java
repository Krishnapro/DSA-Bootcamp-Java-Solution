package com.krishna.ConditionsAndLoops;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        float pi = 3.14f;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        float radius = in.nextFloat();

        float area = (float) (3.14 * radius * radius);
        System.out.println(area);

    }
}
