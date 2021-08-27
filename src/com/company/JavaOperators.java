package com.company;

public class JavaOperators {
    public static void main(String[] args) {
        int num =20;
        int num1 = 21;
        boolean b1 = true;
        boolean b2 = false;
        num++;
        num1--;


        System.out.println("your first number " +num);
        System.out.println("your second number " +num1);
        System.out.println("b1 && b2: " + (b1&&b2));
        System.out.println("b1 || b2: "+ (b1||b2));
        System.out.println("!(b1 && b2): " + (!(b1&b2)));
    }
}
