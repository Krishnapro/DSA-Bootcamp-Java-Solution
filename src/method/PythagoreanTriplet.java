package method;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter triplet: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        pythagoreanTriplet(a,b,c);

    }
    static void pythagoreanTriplet(int a,int b,int c){
        if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a){
            System.out.println("pythagorean triplet");
        }else {
            System.out.println("not pythagorean triplet");
        }

    }
}
