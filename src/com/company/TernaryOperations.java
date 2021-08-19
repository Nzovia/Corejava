package com.company;

public class TernaryOperations {
    /*its syntax is expression?expression:expression
    * to understand the operator if-then-else statements  where it can used in the case of if-else conditions or switch statements
    * */
    public static void main(String[] args) {
        int number1, number2, number3;
        number1 = 5;
        number2 = 4;
        number3 = 7;

        int difference = number1<number2? number2-number1: number3;
        System.out.println("the difference is: "+difference);
    }
}
