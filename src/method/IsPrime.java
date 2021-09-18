package method;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no.=");
        int num = in.nextInt();
        isPrime(num);
    }
    static void isPrime(int n) {
        if (n <= 1) {
            System.out.println("Enter greater than 1");
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("not prime");
                break;
            } else {
                System.out.println("prime");
            }
            break;
        }
    }
}
