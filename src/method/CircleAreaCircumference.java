package method;

import java.util.Scanner;

public class CircleAreaCircumference {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = in.nextInt();
        circumference(radius);
        radius(radius);
    }
    static void circumference (double r){
        double pi = 3.14f;
        double cf = 2*3.14*r;
        System.out.println("circumference= "+cf);
    }
    static void radius(double r){
        double pi = 3.14f;
        double radius = 3.14*r*r;
        System.out.print("Radius= "+radius);
    }

}
