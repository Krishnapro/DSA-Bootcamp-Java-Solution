package ConditionAndLoops.ConditionsAndLoops;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter product price: ");
        float productPrice = in.nextFloat();
        System.out.println("Enter discount % : ");
        float discount = in.nextFloat();
        float totalDiscount = productPrice/100*discount;
        float totalPrice = productPrice - totalDiscount;
        System.out.println(totalPrice);
    }
}
