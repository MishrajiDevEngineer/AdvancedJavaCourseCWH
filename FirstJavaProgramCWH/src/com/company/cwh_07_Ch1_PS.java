package com.company;

import java.util.Scanner;

//PS-Practice Set
public class cwh_07_Ch1_PS {
    public static void main(String[] args){
//        Question1: sum of three number
        int a = 45;
        int b = 44;
        int c = 22;
        int sum = a + b + c;
        System.out.println("The sum of three number is " + sum + "\n");

//        Question2: calculating three no. cgpa
        float subject1 = 45;
        float subject2 = 33;
        float subject3 = 88;
        float cgpa = (subject1 + subject2 + subject3)/30;
        System.out.println("The cgpa of 3 subject is " + cgpa + "\n");

//        Question3: greet user by taking name input of user
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name + " Have a good day!\n");

//        Question4: convert km to miles
        System.out.println("Enter the km covered");
        Scanner scan = new Scanner(System.in);
        double kilometer = scan.nextDouble();
        double miles = kilometer/1.609;
        System.out.println(miles + "\n");

//        Question5: check input is an integer
        System.out.println("Enter the input to check if it's an integer");
        Scanner scc = new Scanner(System.in);
        boolean d = scc.hasNextInt();
        System.out.println(d);
    }
}