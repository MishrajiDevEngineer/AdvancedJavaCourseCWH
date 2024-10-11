package com.company;
import java.util.Scanner;

public class cwh_05_Ch1_TakingInput {
    public static void main(String[] args) {
//        Program1:-
        System.out.println("Taking integer input from the user and then output the sum of these 2-number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum1 = a + b;
        System.out.print("The sum of these number is " + sum1 + "\n\n");

//        Program2:-
        System.out.println("Taking float input from user and providing output of floating number");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Float number 1");
        float c = scan.nextFloat();
        System.out.println("Enter Float number 2");
        float d = scan.nextFloat();
        float sum2 = c + d;
        System.out.print("The sum of these float number is " + sum2 + "\n\n");

//        Program3:-
        System.out.println("Verifying integer input,Please enter anything to verify");
        Scanner scc = new Scanner(System.in);
        boolean b1 = scc.hasNextInt();
        System.out.println(b1 + "\n");

//        Program4:-
        System.out.println("Taking string input and String-line input");
        Scanner sccc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sccc.next();
        System.out.println(str + "\n");

        sccc.nextLine(); //to consume character left inside "sccc.next" input stream

        System.out.println("Enter the full line string");
        String full = sccc.nextLine();
        System.out.println(full);
    }
}