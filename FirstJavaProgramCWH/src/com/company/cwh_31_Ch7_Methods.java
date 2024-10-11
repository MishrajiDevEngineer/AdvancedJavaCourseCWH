package com.company;

public class cwh_31_Ch7_Methods {
    static int logic(int x, int y){
         // why using "int" after static?
         // because we have to use "return" to pass the final "int" i.e integer-value because provided value also in "int"-format,which is directly called using static method,
         // Note:- Also "public" access modifier doesn't compulsary as it's default known by compiler if not specified
        int z;
        if(x > y){
            z = x + y;
        }
        else{
            z = (x + y) * 5;
        }
        return z;
    }



    int nonStaticLogic(int p, int q){
        int r;
        if(p > q){
            r = p + q;
        }
        else{
            r = (p + q) * 5;
        }
        return r;
    }

    public static void main(String[] args) {

        // we use Methods to use DRY= "Do Not Repeat" the logic again and again
        // Lets see the similarity between "Logic-1" and "Logic-2"

        // "Logic-1":
        int a = 3;
        int b = 2;
        int c;
        if (a > b) {
            c = (a + b);
        } else {
            c = (a + b) * 5;
        }
        System.out.println("The result of variable 'a and b' will be " + c);

        // "Logic-2":
        int a1 = 4;
        int b1 = 7;
        int c1;
        if (a1 > b1) {
            c1 = a1 + b1;
        } else {
            c1 = (a1 + b1) * 5;
        }
        System.out.println("The result of variable 'a1 and a2' will be " + c1 + "\n");

        // as we can see that the "Logic-1" and "Logic-2" are totally similar,
        // So to let us "use DRY=Do not repeat", we use method - so that logic doesn't repeat again and again
        // Note: Lets access the logic multiple times using the static method we create at the top.


        // Method-1: Directly calling static method named as logic;
        // Note:-    we can directly call only static method otherwise we have to create object of that method to call the logic
        c = logic(a, b);
        c1 = logic(a1, b1);
        System.out.println("Using Methods for the result of variable 'a and b' will be " + c);
        System.out.println("Using Methods for the result of variable 'a1 and b1' will be " + c1 + "\n");


        // Method-2: Call non-static method by creating object of that class,
        // Note: non-static method can't be called directly through logic inside static main method,rather we have to create object of that class and then use object to call that logic
        // Also Note: static method shares class for all the object of that class,so we don't need to create obj. to call that obj. inside static main method
        // non-static logic created above to call using obj. of that class,

        cwh_31_Ch7_Methods obj = new cwh_31_Ch7_Methods(); // creating object here to call non-static logic method created above
        c = obj.nonStaticLogic(a, b);
        c1 = obj.nonStaticLogic(a1, b1);
        System.out.println("Calling nonStaticLogic-method using class of that object,the result of logic will be " + c);
        System.out.println("Calling nonStaticLogic-method using class of that object,the result of logic will be " + c1);
    }
}