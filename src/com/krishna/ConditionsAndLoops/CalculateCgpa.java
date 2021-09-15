package com.krishna.ConditionsAndLoops;

import java.util.Scanner;

public class CalculateCgpa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter no of sub: ");
        float subNo = in.nextFloat();
        float sum = 0;
        for (int i = 1; i <= subNo ; i++) {
            float subMarks = in.nextFloat();
            float marks = subMarks / 10;
            sum += marks;
        }
        System.out.println("CGPA" + sum/subNo);
    }
}
