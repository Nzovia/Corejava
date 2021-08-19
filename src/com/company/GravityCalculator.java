package com.company;

import java.util.Scanner;

public class GravityCalculator {

    public static void main(String[] args) {
        //a string type variable used to store text
        String textvar = " ";
        //scanner object that takes input stream as a parameter
        Scanner in = new Scanner(System.in);
        //variables
        double gravity = -9.81;
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = -0.0;
        double finalPosition = 0.0;

        do
        {
            System.out.println("Earth's gravity =-9.81");
            System.out.println("Initial position of the object = " +
                    initialPosition + "(input\"pos\"to change it)");
            System.out.println("initial velocity of the object = " + initialVelocity
                    + "(input\"velo\"to change it)");
            System.out.println("falling time = " + fallingTime +
                    "(input\"time\" to change it)");
            finalPosition = 0.5 *gravity * fallingTime * fallingTime * initialVelocity *
                    fallingTime + initialPosition;
            System.out.println("The object position after " + fallingTime+ " the second is "+ finalPosition + "m.");
            System.out.println("Input \"quit\" to exit the application");
            textvar = in.nextLine();

            if("pos".equals(textvar)){
                System.out.println(" input the initial position of the object: ");
                while (!in.hasNextDouble())
                    in.next();
                initialPosition = in.nextDouble();
            }else if("velo".equals(textvar)){
                System.out.println("Enter new initial velocity: ");
                while (!in.hasNextDouble())
                    in.next();
                initialVelocity = in.nextDouble();
            }
            else if("time".equals(textvar)){
                System.out.println("Enter new time for falling object: ");
                while (!in.hasNextDouble())
                    in.next();
                fallingTime = in.nextDouble();
            }
            else if("quit".equals(textvar)){
                System.out.println("\b");

            }
        } while (!"quit".equals(textvar));

    }

}
