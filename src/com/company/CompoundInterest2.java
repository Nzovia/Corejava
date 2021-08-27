package com.company;

import java.util.Scanner;

public class CompoundInterest2 {
    double principle;
    double interestRate;
    double period;
    int notimes;
    public  void interestCalculator( ){
        /*the formula => amount = P* (1+(r/n))^(rt)*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your details " + "principal " + "period " +"number of times");
        System.out.println("principal P: ");
        principle = scanner.nextDouble();
        System.out.println("interestRate r: ");
        interestRate = scanner.nextDouble();
        System.out.println("period t: ");
        period = scanner.nextDouble();
        System.out.println("notimes n: ");
        notimes = scanner.nextInt();
        double amount = principle * Math.pow(1+(interestRate/notimes),(notimes*period));
        double interestAcrued =amount -principle;
        System.out.println("your compound interest amount is: "+ amount );
        System.out.println("interest acrued: " + interestAcrued);
    }

    public static void main(String[] args) {
        CompoundInterest2 compounded = new CompoundInterest2();
        compounded.interestCalculator();
    }
}
