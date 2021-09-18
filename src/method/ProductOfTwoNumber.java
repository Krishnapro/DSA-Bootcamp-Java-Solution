package method;

import java.util.Scanner;

public class ProductOfTwoNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two no.=");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
       int result= product(num1,num2);
        System.out.print("product of two number="+result);
    }
    static int product(int a , int b){
        int c = a*b;
        return (c);
    }
}
