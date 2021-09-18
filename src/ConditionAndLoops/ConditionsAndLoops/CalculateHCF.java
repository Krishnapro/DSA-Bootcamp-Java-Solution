package ConditionAndLoops.ConditionsAndLoops;

import java.util.Scanner;

public class CalculateHCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two no : ");
        long a = in.nextLong();
        long b = in.nextLong();
        long big = 0;
        long small = 0;
        long HCF =0;
        if(a>b){
            big = a;
            small =b;
        }else{
            big = b;
            small =a;
        }
        while ( big != 0 ){
            long rem = big % small;
            big = small;
            small = rem;
            if(rem == 0) {
                HCF = big;
                break;
            }
        }
        System.out.println("HCF" + HCF);
    }
}
