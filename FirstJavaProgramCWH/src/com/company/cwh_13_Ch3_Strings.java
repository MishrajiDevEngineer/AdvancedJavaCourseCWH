package com.company;
import java.util.Scanner;

public class cwh_13_Ch3_Strings {
    public static void main(String[] args) {

//  String initially used as same as Scanner-Class but,

        String str = new String("Mishraji");
        System.out.println("Printing string as a class,which is " + str);

//  Due to heavy usuage,also used as a data type normally.
//  Also "print" doesn't provide new line,while "println" does provide new line after print
        String name = "Brijesh Mishra";
        System.out.println("Printing name as a data type,which is " + name + "\n");

//  Another Methods to print:
        int a = 55;
        float b = 4.5f;
        char alphabet = 'C';
        String name1 = "Krishna";

        System.out.printf("The value of a is %d \n", a); // %d used for integer
        System.out.format("The value of b is %f \n", b); // %f used for float
        System.out.printf("The value of char alphabet is %c \n", alphabet); // %c used for char
        System.out.printf("The value of name1 is %s \n", name1); // %s used for String
        System.out.printf("The value of a is %d and the value of b is %f \n\n", a ,b);

//  Single word and full-line input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence,you want to print");
        String name2 = sc.next();
        System.out.println(name2);
        sc.nextLine(); //to consume extra string

        System.out.println("Enter the Sentence again to print whole");
        String name3 = sc.nextLine();
        System.out.println(name3);
    }
}