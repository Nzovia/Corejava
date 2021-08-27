package com.company;

public class BitwiseOperator {
    public static void main(String[] args) {
        int num1 = 11; //equal to 00001011
        int num2 = 22; //equals to 00010110
        int result = 0;


        result = num1 & num2;
        System.out.println("num1 & num2: " + result);

        result = num1 | num2;
        System.out.println("num1 | num2: " + result);

        result = num1 ^ num2;
        System.out.println("num1 ^ num2: " + result);
    }

}
