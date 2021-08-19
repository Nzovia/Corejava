package com.company;

import java.util.Scanner;

public class HelloWorld {
    public static int result(int a, int b){
        int total =a+b;
        System.out.println("the total result " +total);
        return total;

    }
    public static void main(String[] args) {
        System.out.println("Hello world, we are getti ng internation");
        //this is an object that is used to the scanner library
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scanner.nextLine();
        System.out.println("your name "+name);

        result(4,5);

    }
}
