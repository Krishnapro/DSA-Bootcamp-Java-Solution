package method;

import java.util.Scanner;

public class SumOfTwoDigit {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two digit");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        sum(num1,num2);
    }
    static void sum(int num1,int num2){
        int c = num1+num2;
        System.out.print("sum="+c);

    }
}
