package method;

import java.util.Scanner;

public class DisplayGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = in.nextInt();
        System.out.println("Grade= "+Grade(marks));

    }

    static String Grade(int marks) {
        if (marks >= 91 && marks <= 100) {
            return "AA";
        } else if (marks >= 81 && marks <= 90) {
            return "AB";
        }else if (marks >= 71 && marks <= 80) {
            return "BB";
        }else if (marks >= 61 && marks <= 70) {
            return "BC";
        }else if (marks >= 51 && marks <= 60) {
            return "CD";
        }else if (marks >= 41 && marks <= 50) {
            return "DD";
        }else {
            return "Fail";
        }
    }
}
