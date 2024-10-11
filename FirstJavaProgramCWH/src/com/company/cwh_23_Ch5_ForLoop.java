package com.company;

public class cwh_23_Ch5_ForLoop {
    public static void main(String[] args) {

        // Incrementing ForLoop;
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
        System.out.println(); //to print a new line after for loop ends


        //Quiz-1, print 'n' no. of odd integer number
        int n = 3;
        for (int i=0; i<n; i++){
            System.out.println(2*i+1);
        }
        System.out.println(); //printing new line after loop ends


        //Quiz: Decrementing forLoop to print first 'm' natural no. in reverse order
        for(int m =3; m>0; m--){
            System.out.println(m);
        }
        System.out.println(); //printing new line after loop ends


        // Decrementing forLoop using logical condition
        for(int j=3; j !=0;j--){
            System.out.println(j);
        }
    }
}
