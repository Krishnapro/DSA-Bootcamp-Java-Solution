package com.krishna.ConditionsAndLoops;

import java.util.Scanner;

public class DistanceBtwnPonts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x1 = in.nextFloat();
        float x2 = in.nextFloat();
        float y1 = in.nextFloat();
        float y2 = in.nextFloat();
        double dis = 0;
        dis = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println(dis);
    }
}
