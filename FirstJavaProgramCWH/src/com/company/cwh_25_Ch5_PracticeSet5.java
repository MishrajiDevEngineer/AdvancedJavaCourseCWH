package com.company;

public class cwh_25_Ch5_PracticeSet5 {
    public static void main(String[] args) {

        //Problem: print a star pattern
        for(int i=1; i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }


        //Problem2: find sum of n even number using for loop
        System.out.println("\n");
        int sum=0;
        int n = 5;
        for(int k =1; k <=n; k++){
            sum = sum + (2*k);
        }
        System.out.println("The sum of First 'n' even number is " + sum);


        //Problem3: print multiplication table of given number 'm'
        System.out.println("\n");
        int m = 5;
        for(int l = 1; l <=10; l++) {
            System.out.println(m + " * " + l + " = " + (m * l)); //print using conjuction
            System.out.printf("%d * %d = %d\n", m, l, (m * l)); //print using identifier
        }


        //Problem4: print multiplication table of 10 in reverse order
        System.out.println("\n");
        int p = 10;
        for(int a = 10; a>=1; a--) {
            System.out.printf("%d * %d = %d\n", p, a, (p * a));
        }


        //Problem5: print factorial of a number using while loop
        System.out.println("\n");
        int q = 5;
        int b = 1;
        int factorial = 1;
        while(b <=q){
            factorial *= b;
            b++;
        }
        System.out.println("The factorial of " + q + " is " + factorial +" using while loop");
        System.out.printf("The factorial of %d is %d using while loop\n",q,factorial);


        //problem6: print factorial of a number using for loop
        int factorial2 = 1;
        int r =5;
        for(int c = 1; c <=r;c++){
            factorial2 *= c;
        }
        System.out.printf("The factorial of %d is %d using for loop\n\n",r,factorial2);



        //Problem7: print * pattern using while loop as shown in problem1
        int d = 1;
        while(d<=4) {
            int e = 4; //resetting value of e=4 each time by initialising inside while loop
            while (e >= d) {
                System.out.print("*");
                e--;
            }
            d++;
            System.out.println();
        }


        // Problem8: Whatever we can do using one type of loop,can it also be done using
        // other two types of loop also,true or false?
        // *THE ANSWER IS ABSOLUTELY YES.



        // Problem9: print the sum of number occuring in multiple table of 8
        System.out.println("\n");
        int sum2 = 0;
        int s = 8;
        for(int f = 1; f<=10; f++) {
            sum2 += (s * f);
        }
        System.out.printf("The sum of number occuring in multiple table of %d is %d\n", s,sum2);

        /*
        //Problem10: How many times DoWhile loop has to be executed
        a)At least once  b)At least twice  c)At most once

        Ans: DoWhile loop has to be executed at least once i.e 'a'-option is correct
        */


        // Problem11: print sum of n-even number using while loop
        int sum3 = 0;
        int g = 1;
        int howManyNumber = 4;
        while(g <= howManyNumber){
            sum3 += (2*g);
            g++;
        }
        System.out.printf("The sum of %d even number is %d\n", howManyNumber,sum3);
    }
}
