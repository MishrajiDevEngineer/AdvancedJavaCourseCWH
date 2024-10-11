package com.company;

public class cwh_34_Ch7_Recursion {


    // Factorial Using Recursion-Method
    // factorial(5) = 5*4*3*2*1
    // factorial(n) = n * (n-1) * (n-2) * ... * 1
    // factorial(0) = 1
    // factorial(1) = 1
    // factorial(n) = n * factorial(n-1);
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    // Factorial using 'Iterative-Method"
    static int factorial_Iterative(int m){
        int product =1;
        if(m ==0 || m == 1){
            return 1;
        }
        else{
            for(int i = 1; i<=m; i++){
                product *= i;
            }
            return product;
        }
    }


    // printing fibonacci no. using recursion
    static int fibonacci(int p){
        int fibonacciResult = 0;
        if(p == 1){
            return 0;
        }
        else if(p == 2){
            return 1;
        }
        else if(p>2){
            fibonacciResult = fibonacci(p - 1) + fibonacci(p -2);
        }
        return fibonacciResult;
    }

    public static void main(String[] args) {
        int x =4;
        System.out.println("Printing Factorial using 'Recursion-Method");
        System.out.println("The value of factorial x using recursion is " + factorial(x));
        System.out.println("The value of factorial 0 using recursion is " + factorial(0));
        System.out.println("The value of factorial 1 using recursion is " + factorial(1) + "\n\n");


        // Finding Factorial using Iterative-Method
        int y = 4;
        System.out.println("Finding Factorial using Iterative-Method");
        System.out.println("The Value of Factorial using Iterative-Method will be " + factorial_Iterative(y));
        System.out.println("The Value of Factorial 0 using Iterative-Method will be " + factorial_Iterative(0));
        System.out.println("The Value of Factorial 1 using Iterative-Method will be " + factorial_Iterative(1) + "\n\n");


        // Quick problem: print fibonacci no. using recursion
        int z = 9;
        System.out.println("The value of given fibonacci-series of zth element is " + fibonacci(z));
        System.out.println("The value of given fibonacci-series of 1st-element is " + fibonacci(1));
        System.out.println("The value of given fibonacci-series of 2nd-element is " + fibonacci(2));
    }
}
