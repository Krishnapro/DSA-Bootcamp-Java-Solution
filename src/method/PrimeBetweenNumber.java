package method;

import java.util.Scanner;

public class PrimeBetweenNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number range: ");
        int firstNum = in.nextInt();
        int lastNum = in.nextInt();
        System.out.println("prime between "+firstNum+ " and " +lastNum);
        primeNumber(firstNum,lastNum);

    }
    static void primeNumber(int num1, int num2){
        for(int n=num1; n<=num2; n++){
            if(isPrime(n)){
                System.out.print(n +" ");
            }
        }
    }
    static boolean isPrime(int n){
        if (n == 1){
            System.out.print("Enter first value above 1 ");
            System.exit(n);
        }
            for(int i=2; i<=Math.sqrt(n); i++ ) {
                if (n % i == 0) {
                    return false;
                }
            }
         return true;
    }

}

