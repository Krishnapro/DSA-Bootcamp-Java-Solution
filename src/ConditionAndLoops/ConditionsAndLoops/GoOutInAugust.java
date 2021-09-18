package ConditionAndLoops.ConditionsAndLoops;

import java.util.Scanner;

public class GoOutInAugust {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int August = 31;
        int count = 0;
        for (int i = 1; i <= 31 ; i++) {
            if (i % 2 == 0){
                count++;
            }
        }
        System.out.print("Kunal go out with friend in August= " +count + "days");
    }
}
