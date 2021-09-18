package ConditionAndLoops.ConditionsAndLoops;

import java.util.Scanner;

public class NprAndNcr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n and r: ");
        long n = in.nextLong();
        long r = in.nextLong();
        long factN = 1;
        long factR = 1;
        for (int i = 1; i <= n; i++) {
            factN *= i;
        }
        System.out.println(factN);
        for (int i = 1; i <= r; i++) {
            factR *= i;
        }
        System.out.println(factR);
        long nr = n - r;
        long factNR = 1;
        for (int i = 1; i <=nr; i++) {
            factNR *= i;
        }
        long nPr = factN / factNR;
        long nCr = factN / (factR * factNR);
        System.out.println(n + "p" + r +"=" + nPr);
        System.out.println(n +"c"+r+"=" +nCr);

    }
}
