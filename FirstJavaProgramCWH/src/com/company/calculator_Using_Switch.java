package com.company;
import java.util.Scanner;

public class calculator_Using_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation want to do:");
        System.out.print("Enter 1 for Addition,Enter 2 for Subtraction,Enter 3 for Multiplication,Enter 4 for Division.");
        int operation = sc.nextInt();


        System.out.println("Enter the value of First number");
        int a = sc.nextInt();
        System.out.println("Enter the value of Second number");
        int b = sc.nextInt();


        switch (operation){
            case 1:
                System.out.println("Addition of First-number and Second-number are = " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction of First-number and Second-number are = " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication of First-number and Second-number are = " + (a * b));
                break;
            case 4:
                System.out.println("Division of First-number and Second-number are = " + (a / b));
                break;
        }
    }
}