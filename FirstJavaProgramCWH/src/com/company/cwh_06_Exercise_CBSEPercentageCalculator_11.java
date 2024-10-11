package com.company;

import java.util.Scanner;

public class cwh_06_Exercise_CBSEPercentageCalculator_11 {
    public static void main(String[] args){
        System.out.println("Find your Percentage obtained in CBSE Board");
        System.out.println("Enter the Physics Subject Marks Obtained");
        Scanner sc = new Scanner(System.in);
        float Physics = sc.nextFloat();
        System.out.println("Enter the Obtained Marks in Chemestry Subject");
        float Chemestry = sc.nextFloat();
        System.out.println("Enter the Obtained Marks in Maths Subject Marks obtained");
        float Maths = sc.nextFloat();
        System.out.println("Enter the Obtained Marks in Biology Subject");
        float Biology = sc.nextFloat();
        System.out.println("Enter the Obtained Marks in English Subject");
        float English = sc.nextFloat();

        float TotalMarks = Physics + Chemestry + Maths + Biology + English;
        float PercentageObtained = TotalMarks*(100/500f);

        System.out.println("The Obtained Percentage of CBSE Board Exam are " + PercentageObtained + "%");
    }

}