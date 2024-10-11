package com.company;

public class cwh_10_Ch2_Resulting_DataType {
    public static void main(String[] args) {
        byte a = 127;
        short b = 32767;
        System.out.println("byte and short result will be int = " + (b - a) + "\n");


        short c = 32767;
        int d = 2147483647;
        System.out.println("short and int resulting will be int = " + (d - c) + "\n");


        long e = 4444l;
        float f = 44.44f;
        System.out.println("long and float resulting will be float = " + (e - f) + "\n");

        int g = 444;
        float h = 4.44f;
        System.out.println("int and float resulting will  be float = " + (g - h) + "\n");


        char hello = (char) 'd'; //ASCII value of 'd' is 100;
        int i = 4;
        System.out.println("char and int resulting will be int = " + (hello + i) + "\n");

        char hey = (char) 'e';
        short j = 4;
        System.out.println("char and short resulting will be int = " + (hey + j) + "\n");

        long k = 66666l;
        double l = 4444d;
        System.out.println("long and double resulting will be double = " + (k-l) + "\n");

        float m = 444.4f;
        double n = 44d;
        System.out.println("float and double resulting will be double = " + (m-n) + "\n");


        //Increament and Decrement operators
        int p = 45;
        System.out.println("p++ means first print then increment will be " + p++);
        System.out.println("Printing p after already runned p++ will be " + p);
        System.out.println("++P result will be first increament then print " + (++p));
        System.out.println("lets print p last time " + p + "\n");


        // Quick Quiz
        // find value of x,if int y = 7;
        // int x = ++y * 8;
        int y = 7;
        int x = ++y * 8; //first y increament by +1 and become 8 then y multiplied by 8
        System.out.println("The value of x is " + x);

        //Quick 2;
        char character = 's';
        character++;
        System.out.println("The increamented character will be " + character);

    }
}
