package com.company;

public class cwh_27_Ch6_ArrayUsingLoop_EachLoop {
    public static void main(String[] args) {

        float[] marks = {34.5f, 39.5f, 33.5f, 83.5f, 22.5f};
        String [] student = {"Rohan", "Rahul", "Akanksha", "Mishraji"};
        System.out.println("To find length of array,we use arrayName.length, hence the length of marks is " + marks.length);
        System.out.println("Name of 3rd index student is " + student[3] + "\n");


        int [] marks1 = {22, 34, 45, 33, 99, 100};
        System.out.println("Displaying below array element using naive method " + marks1.length);

        //Displaying array (Naive way)
        System.out.println(marks1[0]);
        System.out.println(marks1[1]);
        System.out.println(marks1[2]);
        System.out.println(marks1[3]);
        System.out.println(marks1[4]);
        System.out.println(marks1[5] + "\n");

        //Quick quiz: Displaying Array (using loop)
        System.out.println("Displaying Array using Loop method");
        for(int i=0; i < marks1.length; i++){
            System.out.println(marks1[i]);
        }
        System.out.println("\n");

        //Displaying Array in reverse order
        System.out.println("Displaying Array in reverse order using loop");
        for(int i = marks1.length -1; i>=0; i--){
            System.out.println(marks1[i]);
        }
        System.out.println("\n");


        // Displaying Array ( using each loop)
        for(int element: marks1){
            System.out.println(element);
        }






    }
}
