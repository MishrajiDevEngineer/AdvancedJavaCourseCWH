package com.company;

public class cwh_32_Ch7_MethodOverloading {

    // When we don't want our method to return anything,then we use "void" return type
    static void telljoke(){
        System.out.println("I Invented a New Word \n" + "Plagarism" );
    }


    static void change(int a){
        a =965;
        System.out.println("The value inside static change logic is set to: " + a);
    }

    static void change2(int [] arr){
        arr[0] = 121;
    }



// METHOD-OVERLOADING: Two or more methods have same name but different parameters
// Parameters are variable name with it's datatype
// Arguments are actual value provided to parameters i.e variable name with datatype , but with actual value

    static void foo(){
        System.out.println("Good Morning Bro!");
    }

    static void foo(int a){
        System.out.println("Good Morning " + a + " Bro!");
    }

    static void foo(int a , int b){
        System.out.println("Good Morning " + a + " Bro!");
        System.out.println("Good Morning " + b + " Bro!");
    }

    public static void main(String[] args) {
        telljoke(); // running telljoke(); logic in whcih return type not given so we use void-return type


        // Case-1: is changing value of original variable using method function will overwrite the original variable
        // Answer: No,it will not change bcoz. only the copy of variable inside main method only passed.
        int x = 899;
        change(x);
        System.out.println("The value of x after running change is " +  x);


        // Case-2: Is original array element will change after running change2 method
        // Answer: Yes,the value of array will change, as it's point toward same reference.Detailed ans. check below line
        // Note: as we all know that method only copies the object but pointing toward same reference,so value should be change after running "change2"
        // Overall Java use primitive data-types as a "copy" inside method, while the reference copy has been passed for an object
        // Note2: Array is treated as an object and it's reference passed.Hence both method and main method point toward same obj. hence the obj. value will be changeable.
        int [] marks = {33, 24, 43, 99, 44};
        change2(marks);
        System.out.println("The value of marks[0] after running change2 is " + marks[0] + "\n");


        // METHOD-OVERLOADING:-
        // Calling multiple methods of same name known as "Method-Overloading"
        System.out.println("Calling 'foo' named, 3-methods with different parameters to use 'Method-Overloading'");
        foo();
        foo(3000);
        foo(10,20);


// Note: we can't do method overloading by changing the datatype of method because same no. of input variable already defined for void method
// Also note: we can process method overloading by changing datatypes of method but the no. of input variable should be differ from previous all input variable no.

// Special-Note: Difference between "Parameters and Arguments"
// Answer: Parameters are like variables or formula which needs to pass the value to the variable to get result through formula,
//.. While Arguments are an actual value for the parameters: "Remember trick: Arguments are Actual Value,both start with A"
    }
}
