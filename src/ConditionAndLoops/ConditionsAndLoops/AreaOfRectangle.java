package ConditionAndLoops.ConditionsAndLoops;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter width  and height: ");
        float w = in.nextFloat();
        float h = in.nextFloat();
        float area = w * h;
        System.out.println(area);
    }
}
