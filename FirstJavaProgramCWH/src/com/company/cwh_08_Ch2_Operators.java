package com.company;

public class cwh_08_Ch2_Operators {
    public static void main(String[] args) {
//        1.Arithmatic Operators
        int a = 10;
        int b = 3;
        int sum = a + b;
        int substraction = a - b;
        int multiply = a * b;
        int division = a / b;
        int modulous = a % b;
        b++;
        a--;
        System.out.println("sum of a and b " + sum);
        System.out.println("substration of a and b " + substraction);
        System.out.println("Multiplication of a and b " + multiply);
        System.out.println("Division of a and b " + division);
        System.out.println("The Remainder of a and b are " + modulous);
        System.out.println(b);
        System.out.println(a + "\n");

//        2.Assignment Operators
        float c = a; // equals operator is used to assign values i.e "a" value is assign to "c"
        System.out.println("Assigned value printed " + c);
        c += 1;
        System.out.println("Increament in value " + c);
        c -= 2;
        System.out.println("Decreament in vlaue " + c);
        c *=2;
        System.out.println("increament by multiplication in value " + c);
        c /= 3;
        System.out.println("Decreament by Division in value " + c + "\n");


//        3.Comparision Operators
        System.out.print("equals to comparison: ");
        System.out.println(a == b);
        System.out.print("less than equals comparison: ");
        System.out.println(a <= b);
        System.out.print("greater than equals comparison: ");
        System.out.println((a >= b) + "\n");


//        4.Logical Operators
        System.out.print("OR logic operator: ");
        System.out.println(a<=b || a>=b);
        System.out.print("AND logic operator: ");
        System.out.println(a<=b && a>=b);

    }
}