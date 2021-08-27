package com.company;

public class NestedIf {
    public static void main(String[] args) {

        int age =24;
        boolean registered = true ;
        //the nested if helps in checking whether the condition is tue lets move inside check if the next cod eis true
        //if true execute else if not check on the
        if (age >= 18){
            if(registered = true){
                System.out.println("eligible to vote");
            }
            else if (registered =false){
                System.out.println("not eligible to vote");
            }
            else{
                System.out.println("something is wrong");
            }

        }else{
            System.out.println("wait until you are 18");
        }
    }

}
