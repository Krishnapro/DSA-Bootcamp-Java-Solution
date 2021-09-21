package method;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        isPalindrome(n);
    }
    static void isPalindrome(int num){
        int temp = num, rem=0, sum=0;
        while(num>0){
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        if(temp == sum){
            System.out.print("palindrome="+sum);
        }else {
            System.out.print("not palindrome= " +sum);
        }
    }
}
