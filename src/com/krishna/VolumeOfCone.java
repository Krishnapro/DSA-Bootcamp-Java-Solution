package com.krishna;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        float pi = 3.14f;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Radius and height: ");
        float r = in.nextFloat();
        float h = in.nextFloat();

        float volume = pi * r * r * h/3;
        System.out.println(volume);
    }
}
