package com.company;

//OP: Operator
public class cwh_09_Ch2_OP_Precedence {
    public static void main(String[] args) {
        // Case1:

        int a = 6*5-32/2;
        System.out.println("The value of a is " + a);
        //Here BODMASS Rule is not considered,instead Precedence and Associativity followed
        // i.e First left solved and then move toward right.
        // (Also * and / has highest precedence value then + and -,hence first * and / solve first if * and / precedence collide then left to right Associativity considered)


        /*
        || Precedence and Associativity ||
        || Solution ||
         int a = 6*5-32/2;
         int a = (6*5) - (32/2)
         int a = 30 - (32/2)
         int a = 30 - 16
         int a = 14;
        */

        // Case2:
        int c;
        int b = c = a;
        System.out.println("The value of b is " + b); //it prints value of "a" why? because "=" has right to left associativity


        // Quick Quiz:

        //1.
        int x = 6;
        int y = 1;
        int k = (x+y)/2; //(6+1/2)= 7/2f = 3.5 but output=3, bcoz int to int division is int only.
        System.out.println("The value of k is " + k);


        //2.
        int d =2;
        int e = 3;
        int f = 4;

        int QuadEquation = (e*e - 4*d*f)/(2*d);
        System.out.println("The value of QuadEquation is " + QuadEquation);
        //int QuadEquation = (e*e - 4*d*f)/(2*d) = (3*3 - 4*2*4)/(2*2) =(9-32)/(2*2)
//                         = (9 - 32)/4 = (-23/4) = -5;
    }
}
