package com.company;

import java.util.Scanner;

public class cwh_12_Ch2_PS2 {
    public static void main(String[] args) {

//  Result of expression : float a = 7/4 * 9/2 , result will be integer as int/int= int not float
        float aa = 7/4 * 9/2;
        System.out.println("The value of aa will be " + aa); // a = 4.0 which is wrong mathematically
        float b = 7/4f * 9/2f;
        System.out.println("The value of b will be " + b + "\n"); // b = 7.875 correct mathematically

//  Encrypt the grade by adding 8 and then degrade
        char Grade = 'C';
        //Encrypting Grade
        Grade = (char)(Grade + 8);
        System.out.println("The encrypted Grade will be " + Grade);

        //Decrypting Grade
        Grade = (char)(Grade - 8);
        System.out.println("The Decrypted Grade will be " + Grade + "\n");


//  Find entered no. greater than or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. to check, if it's greater than hidden no. or not");
        int number = sc.nextInt();
        boolean result = (number > 8);
        System.out.println(result + "\n");


//  Writing maths equation in Programming IDE
        int u = 2;
        int v = 3;
        int a = 1;
        int s = 2;
        int equation = (v*v - u*u)/(2*a*s);
        System.out.println("resulting equation answer will be " + equation);

//  int x = 8; int a = 7*49/x + 35/x....find value
        int x = 8;
        int y = ((7 * 49)/x) + 35/x; //y = 46 because int/int= int not float
        System.out.println("The value of y should be in float but it's in int due to int/int operation,which is " + y);
    }
}