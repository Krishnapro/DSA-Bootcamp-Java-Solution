package method;

import java.util.Scanner;

public class SumOfFirstNaturalNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter natural no. ");
        int n = in.nextInt();
        System.out.println(sum(n));
    }
    static int sum(int n){
        return (n*(n+1))/2;
    }
}
