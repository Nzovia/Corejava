package com.company;

import java.util.Scanner;

public class ControlStructures {
    public static void main(String[] args) {
        //if control structure is boolean output statement
        //it controls true or false output
        int age = 0;
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter age: ");
        age = scanner.nextInt();

        if(age>25)
        {
            System.out.println("your age " +age+ " please get a partner");
        }
        else{
            System.out.println("study first");
        }
        //determine if a number is odd or even using the if statements
        System.out.println("enter a random number: ");
        number = scanner.nextInt();
        if(number % 2 == 0){
            System.out.println("you are the lucky winner");
        }else {
            System.out.println("try next time");
        }
    }
}
