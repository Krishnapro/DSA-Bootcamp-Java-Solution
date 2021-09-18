package ConditionAndLoops.ConditionsAndLoops;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter year to check: ");
        int year = in.nextInt();
        if(year % 4 == 0 && year % 100 != 0){
            System.out.print("leap year:" +year);
        }else if (year % 400 ==0 && year % 100 == 0){
            System.out.print("leap year:" + year);
        }else {
            System.out.println("not leap year: " + year);
        }
    }
}
