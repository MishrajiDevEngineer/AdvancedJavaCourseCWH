package com.company;

public class cwh_26_Ch6_Array {
    public static void main(String[] args) {
 /*
    classroom of 500 students - you have to store marks of 500 students:
    you have 2 options:-
    1. Create 500 variables
    2. Use Arrays(recommended)
*/

//        There are 3-main ways to create Arrays in java
//        1. Declaration and memory allocation
        int[] marks = new int[5];
        marks[0] = 22; //checking if it's declared and allocated
        marks[1] = 35;
        System.out.println("Declaration and memory allocation method,output of index[0] is " + marks[0]);
        System.out.println("Declaration and memory allocation method,output of index[1] is " + marks[1] + "\n");

//        2.Declaration and then memory allocation
        int [] marks1;
        marks1 = new int[2];
//        Initialization
        marks1[0] = 35;
        marks1[1] = 34;
        System.out.println("Declarationa and then memory allocation method,output of index[0] is " + marks1[0]);
        System.out.println("Declarationa and then memory allocation method,output of index[1] is " + marks1[1] + "\n");
//        System.out.println(marks1[2]); //throw an error,as length is maximum 2 only

//        Declaration,memory allocation and initialization together
        int [] marks2 = {23, 44, 21, 38, 49};
        System.out.println("Declarationa,memory allocation and initialization together method,output of element[3] is " + marks2[3]);
        System.out.println("Declarationa,memory allocation and initialization together method,output of element[4] is " + marks2[4]);


//        Note: index of Arrays starts from '0' and goes till (n-1),where n represent the length of array.
    }
}
