package com.company;

public class CompoundInterest {
    public void calculate(int p, int t, double r, int n) {
        double amount = p * Math.pow(1 + (r / n), n * t);
        double interest = amount - p;
        System.out.println("The Compound Interest in " + t + " years: "+interest);
        System.out.println("Amount after " + t + " years: "+amount);
    }
    public static void main(String args[]) {
        CompoundInterest compoundInterest = new CompoundInterest();
        compoundInterest.calculate(2000, 5, .08, 12);
    }

}
