package method;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no.:");
        int a = in.nextInt();
        OddEven(a);
    }
    static void OddEven(int a){
        if(a %2 ==0){
            System.out.print("even="+a);
        }else{
            System.out.print("odd="+a);
        }
    }
}
