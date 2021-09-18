package method;

import java.util.Scanner;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

       maximum(a,b,c);
       minimum(a,b,c);
    }
    static void maximum(int a, int b, int c){
        int max = 0;
        if(a>b && a>c){
            max = a;
        }else if(b>c && b>a){
            max = b;
        }else {
            max = c;
        }
        System.out.println("maximum"+max);
    }
    static void minimum(int a,int b,int c){
        int min = 0;
        if(a<b && a<c){
            min = a;
        }else if(b<c && b<a){
            min = b;
        }else{
            min = c;
        }
        System.out.println("minimum"+min);
    }
}
