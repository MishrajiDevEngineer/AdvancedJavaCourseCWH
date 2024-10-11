package com.company;

public class cwh_33_Ch7_VarArgs {
    static int sum(int a , int b){
        return a +b;
    }

    static int sum(int a , int b, int c){
        return a + b + c;
    }

    static int sum(int a , int b, int c, int d){
        return a +b + c + d;
    }

    static int sum(int a , int b,int c,int d, int e){
        return a +b + c + d + e;
    }

    // "VarArgs-Method" -
    static int sum2(int ...arr){
        //( int ...arr, is available as int [] arr )
        int result = 0;
        for(int element : arr){
            result += element;
        }
        return result;
    }

    // 'VarArgs', with one-necessary arguments
    static int sum3(int x, int ...arr){
        int result = x;
        for(int element: arr){
            result += element;
        }
        return result;
    }

    public static void main(String[] args) {
        // Case-1: NAIVE METHOD -
        // Here for every new variable of sum() method we have to use multiple-overloading
        // But the new variable can be many times,hence using "method-overloading for multiple unknown varibale appear in the sum() method is time taken & not memory efficient
        // Hence we will use "VarArgs" to follow practices of "DRY: do not repeat yourself"

        System.out.println("NAIVE-METHOD to use method overloading for multiple unknown variable which may be found in future modification");
        System.out.println("The sum of 2 and 3 using Naive-method-overloading is " + sum(2,3));
        System.out.println("The sum of 2,3 and 4 using Naive-method-overloading is " + sum(2,3,4));
        System.out.println("The sum of 2,3,4 and 5 using Naive-method-overloading is " + sum(2,3,4,5));
        System.out.println("The sum of 2,3,4,5 and 6 using Naive-method-overloading is " + sum(2,3,4,5,6) + "\n\n");


        // Case-2: ADVANCED-MEHTOD -
        // To prevent from using method overloading multiple times we use "VarArgs"
        // "VarArgs" store all the upcoming arguments in Array parameter to remove this issue
        System.out.println("Printing any no. of variable sum using 'VarArgs");
        System.out.println("The sum of nothing using VarArgs is " + sum2());
        System.out.println("The sum of 2,3 using VarArgs is " + sum2(2,3));
        System.out.println("The sum of 2,3 and 4 using VarArgs is " + sum2(2,3,4) + "\n\n");


        // Case-3: at least One-argument should be necessary then "VarArgs should use like this"
        System.out.println("Printing 'VarArgs', but atleasst 1-argument entry is compulsary");
        System.out.println("Printing 'VarArgs', with one-necessary arguments is " + sum3(4));
        // Below code will not parse as it doesn't have any single argument available,so commented
        // System.out.println("Printing 'VarArgs', with one-necessary arguments is " + sum3());
        System.out.println("Printing 'VarArgs', with one-necessary arguments and 3 other argument is " + sum3(4,5,6,7));
        System.out.println("Printing 'VarArgs', with one-necessary arguments and 5 other argument is " + sum3(4,9,8,7,6,5));



    }
}
