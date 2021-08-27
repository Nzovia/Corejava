package com.company;

import java.util.Date;
import java.util.Locale;

public class InbuiltMethods {
    public static void main(String[] args) {
        String name = new String("ProfNicholas");
        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println(name.charAt(0));
        Date date = new Date();
        System.out.println("today its a monday " + date);
        System.out.println(Math.max(24,3));
    }
}
