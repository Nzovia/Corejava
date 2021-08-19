package com.company;

public class SwappingValues {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println("Before swapping, a = " + a + " and b = " + b);
        // Invoke the swap method
        swapFunction(a, b);
        System.out.println("\n************************************************:");
        System.out.println("After swapping, a = " + a + " and b is " + b);
    }
    public static void swapFunction(int a, int b)
    {
        System.out.println("Before swapping, a = " + a + " b = " + b);
        int c = a; a = b; b = c;
        System.out.println("After swapping, a = " + a + " b = " + b); }

}
