package com.company;

import java.util.Scanner;

public class cwh_19_Ch4_PS {
    public static void main(String[] args) {

        System.out.println("Problem1 is for checking syntax test,so commented and can't be run\n");
//  Problem1:

//        int a = 10;
//        if(a = 11){
//           "=" is assignment operator which is boolean,and int can't be converted to boolean;
//           we have to use "==" equals to operator to remove syntax error;
//            System.out.println("I am 11");
//        }
//        else{
//            System.out.println("I am not 11");
//        }


//  Problem2: find student pass or fail if 3-subject has 33% min and overall 40% min in total

        Scanner sc = new Scanner(System.in);
        System.out.println("Check your Result");
        System.out.println("Enter Your physics subject marks out of 100");
        byte physics = sc.nextByte();

        System.out.println("Enter your Chemistry subject marks out of 100");
        byte chemistry = sc.nextByte();

        System.out.println("Enter your maths subject marks out of 100");
        byte maths = sc.nextByte();

        float TotalMarks = physics + chemistry + maths;
        float TotalPercentage = TotalMarks*(100/300f);

        System.out.println("Your overall percentage is " + TotalPercentage);

        if(physics >= 33 && chemistry >= 33 && maths >= 33 && TotalPercentage >= 40){
            System.out.println("Yes,congratualtions you are passed and promoted to next class\n");
        }
        else{
            System.out.println("Sorry!,You are not promoted. Please study well this time\n");
        }


//  Problem3:Income tax paid by employee at 5%,20% and 30% acc. to income slab;

        float tax =0f;
        System.out.println("Find your tax generated,Now Enter your income in lakhs");
        float income = sc.nextFloat();

        if(income < 2.5f){
            tax  = tax + 0;
            System.out.println("tax is not valid");
        }
        else if(income >= 2.5f && income <5.0f){
            tax = tax + 0.05f*(income - 2.5f);
            System.out.println("Your tax will be " + tax);
        }
        else if(income >=5.0f && income<10.0f){
            tax = tax + 0.2f*(income - 5.0f);
            tax = tax + 0.05f*(5.0f - 2.5f);
            System.out.println("Your tax will be " + tax);
        }
        else if (income >= 10.0f){
            tax = tax + 0.3f *(income - 10.0f);
            tax = tax + 0.2f*(10.0f - 5.0f);
            tax = tax + 0.05f*(5.0f - 2.5f);
            System.out.println("Your tax will be " + tax);
        }

//  Problem4: Program to find the Day by entering number from 1 to 7;

        System.out.println("      ");
        System.out.println("Enter number from 1 to 7 to find out the name of Day");
        byte number = sc.nextByte();

        switch(number){
            case 1 -> System.out.println("This Belongs to Monday\n");
            case 2 -> System.out.println("This Belongs to Tuesday\n");
            case 3 -> System.out.println("This Belongs to Wednesday\n");
            case 4 -> System.out.println("This Belongs to Thursday\n");
            case 5 -> System.out.println("This Belongs to Friday\n");
            case 6 -> System.out.println("This Belongs to Saturday\n");
            case 7 -> System.out.println("This Belongs to Sunday\n");
        }


//  Problem6: Program to find Leap-Year;

        System.out.println("Enter the Year to find out,if it is a leap-year or not");
        int year = sc.nextInt();

        if (year % 4==0 && year % 100 !=0 || year % 400 ==0){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }


//  Problem7: Program to find type of website;

        System.out.println("Enter your website name like www.example.com");
        String website = sc.next();

        if (website.endsWith(".org")){
            System.out.println(website + " is an organisational website");
        }
        else if (website.endsWith(".com")){
            System.out.println(website + " is an commercial website");
        }
        else if (website.endsWith(".in")){
            System.out.println(website + " is an indian website");
        }

    }
}
