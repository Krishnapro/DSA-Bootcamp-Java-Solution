package method;

import java.util.Scanner;

public class EligibleForVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter age:");
        int age = in.nextInt();
        vote(age);
    }
    static void vote(int age){
        if(age>=18){
            System.out.print("you can vote="+age);
        }else{
            System.out.print("you can't vote="+age);
        }
    }
}
