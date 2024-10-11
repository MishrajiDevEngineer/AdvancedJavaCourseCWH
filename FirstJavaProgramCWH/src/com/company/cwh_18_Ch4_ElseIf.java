package com.company;

import java.util.Scanner;

public class cwh_18_Ch4_ElseIf {
    public static void main(String[] args) {
//  Else IF Program
        byte age;
        System.out.println("This is \"else if\" program");
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextByte();

        if(age > 56){
            System.out.println("You are experienced");
        }
        else if(age > 46){
            System.out.println("You are semi-experienced");
        }
        else if(age > 36){
            System.out.println("You are semi-semi experienced");
        }
        else{
            System.out.println("You are not experienced");
        }

        if(age > 12){
            System.out.println(" But,You are not baby anymore\n");
        }
        else{
            System.out.println(" And also,You still considered as a baby\n");
        }



//  Switch Case Program;

        System.out.println("This is \"Swtich case\" Program");
        System.out.println("Enter your age from the options: 18,24,68 or any age you wish");
        byte age1;
        age1 = sc.nextByte();
        switch (age1) {
            case 18:
                System.out.println("You are going to become an adult!\n");
                break;
            case 24:
                System.out.println("You are going to join a Job!\n");
                break;
            case 68:
                System.out.println("You are going to get retired!\n");
                break;
            default:
                System.out.println("Enjoy your life!\n");
        }

//  Enhaced Switch Program

        String var;

        System.out.println("This is enchanced Switch Program");
        System.out.println("Enter you name like Shubham,Brijesh,Mishrajialive or any name");
        var = sc.next();

        switch (var){
            case "Shubham" ->{
                System.out.println("Shubham you are going to become an adult!");
                System.out.println("Shubham you are going to become an adult!");
                System.out.println("Shubham you are going to become an adult!");
            }
            case "Brijesh" -> System.out.println("Brijesh you are going to pass-out in 2024");
            case "Mishrajialive" -> System.out.println("Hey I know you,You are an instagram user");
            default -> System.out.println("Enjoy your life");
        }

    }
}
