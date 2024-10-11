package com.company;
import java.util.Scanner;

public class cwh_22_Ch5_DoWhileLoop {
    public static void main(String[] args) {

        //DoWhileLoop, first enter the body and run the program then checks the while condition
        int a = 0;
        do {
            System.out.println(a);
            a++;
        } while(a < 5);


        //Problem-1, print first 'n' natural number using DoWhileLoop

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first 'n' natural number you want to print");
        int n = sc.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}
