package com.company;

public class cwh_35_Ch7_Method_PS {

    static void multiplication(int n){
        for(int i=1; i<=10; i++){
            System.out.format("%d * %d = %d\n",n,i,n*i);
        }
    }

    static void pattern1(int m){
        for(int i = 0; i<m; i++){
            for(int j = 0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int SumRec(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n + SumRec(n -1);
        }
    }

    static void pattern2(int m){
        for(int i = 0; i < m; i++){
            for(int j = m;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fibonacciRec(int m){
        if(m == 1 || m == 2){
            return (m -1);
        }
        else{
            return fibonacciRec(m-1) + fibonacciRec(m -2);
        }
    }


    static int avgArgs(int n, int m, int... arr) {
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        return (n + m + sum);
    }


    static void inverse_rec_starPattern(int n) {
        if (n > 0) {
            for (int i = n; i >0; i--) {
                System.out.print("*");
            }
            System.out.println();
            inverse_rec_starPattern(n - 1);
        }

    }

    public static void main(String[] args) {

        // Problem-1: print the table to any natural number using methods
        System.out.println("Problem-1: Printing table of any natural number");
        multiplication(7);

        // Problem-2:
        System.out.println("\nProblem2: Prining star pattern using function named pattern1"); //Creates new line before running problem-2;
        pattern1(4);

        // Problem-3:
        int n = 7;
        int c = SumRec(n);
        System.out.format("\nThe sum of first %d natural no. is %d ",n,c);


        // Problem-4: print star patten "mirror of problem2" in vertical direction
        System.out.println("\n\nProblem-4: Printing inverse left 'Right angle' triangle using star pattern");
        pattern2(4);

        // Problem-5: repeat problem-4 again using recursion method
        System.out.println("\n\nPrinting problem-4 using recursion method");
        inverse_rec_starPattern(4);

        // Problem-6: print n-th term of fibonacci using recurrsion
        System.out.println();  // To create new Line
        System.out.println(fibonacciRec(9));


        // Problem-7: print Avg. of given set of arguments
        System.out.println("\nThe sum of given no. is " + avgArgs(2,3,5,6,9,11,12));

    }
}
