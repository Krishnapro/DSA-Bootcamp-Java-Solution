package method;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no.: ");
        int num = in.nextInt();
        System.out.print("Factorial= "+ factorial(num));
    }
    static int factorial(int num){
        int fact = 1;
        for (int i=1; i<=num; i++){
            fact *=i;
        }
        return fact;
    }
}
