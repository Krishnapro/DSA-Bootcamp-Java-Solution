package com.krishna.ConditionsAndLoops;

import java.util.Scanner;

public class SumOfNegativePositiveNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter list of number= ");
        long numberList = in.nextLong();
        long sumNegative = 0;
        long sumPoEven = 0;
        long sumPosOdd = 0;
        long rem = 0;
        while (numberList != 0){
            long num = in.nextLong();
            numberList = num;
            if(numberList < 0){
                sumNegative += numberList;
            }else if (numberList > 0 && numberList % 2 == 0){
                sumPoEven += numberList;
            }else{
                sumPosOdd += numberList;
            }
        }
        System.out.println("sum of negative = " +sumNegative);
        System.out.println("sum of even positive = "+sumPoEven);
        System.out.println("sum of odd positive = "+sumPosOdd);
    }
}
