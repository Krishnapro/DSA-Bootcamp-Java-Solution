package ConditionAndLoops;

import java.util.Scanner;

public class GreetingForName {
    public static void main(String[] args) {
        System.out.print("Enter name: ");
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();

        System.out.println("Hello," + name + "!");

    }
}
