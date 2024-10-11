package com.company;

public class cwh_17_Ch4_LogicalOperator {
    public static void main(String[] args) {
//  "And" logical operator only returns "true" if both value are true
//  Case1:

        boolean a = true;
        boolean b = false;

        System.out.println("AND logical operator returns true only if all the values are true\n");
        if(a && b){
            System.out.println("Case1:Yes,condition satisfied for \"AND\" logic operator");
        }
        else{
            System.out.println("Case1:No,condition is not satisfied for \"AND\" logic operator");
        }

//  Case2:

        boolean a1 = true;
        boolean b1 = true;
        if(a1 && b1){
            System.out.println("Case2:Yes,condition is satisfied for \"AND\" logic operator");
        }
        else{
            System.out.println("Case2:No,condition is not satisfied for \"AND\" logic operator");
        }

//  Case3:

        boolean a2 = true;
        boolean b2 = true;
        boolean c3 = false;
        if(a2 && b2 && c3){
            System.out.println("Case3:Yes,condition is satisfied for \"AND\" logic operator\n");
        }
        else{
            System.out.println("Case3:No,condition is not satisfied for \"AND\" logic operator\n");
        }

//  "OR" logical-operator return "True" if any of the statement are true;
//  Case4:

        boolean a4 = true;
        boolean b4 = false;
        System.out.println("OR logical operator returns true,if any one the value are true\n");
        if(a || b){
            System.out.println("Case4:Yes,condition is satisfied for \"OR\" logic operator");
        }
        else{
            System.out.println("Case4:NO,condition is not satisfied for \"OR\" logic operator");
        }

//  Case5:

        boolean a5 = true;
        boolean b5 = true;
        if (a5 || b5){
            System.out.println("Case5:Yes,condition is satisfied for \"OR\" logic operator");
        }
        else{
            System.out.println("Case5:No,condition is not satisfied for \"OR\" logic operator");
        }

//  Case6:

        boolean a6 = true;
        boolean b6 = true;
        boolean c6 = false;
        if (a6 || b6 || c6){
            System.out.println("Case6:Yes,condition is satisfied for \"OR\" logic operator\n");
        }
        else{
            System.out.println("Case6:Yes,condition is not satisfied for \"OR\" logic operator\n");
        }

//  "NOT" logical operator returns "true" if false and returns "False" if value are true;
//  Case7:

        boolean a7 = true;
        boolean b7 = true;
        System.out.println("NOT logical operator always returns opposite value i.e if true then returns \"False\" and vice-versa\n");
        if (a7 != b7){
            System.out.println("Case7: No,condition is not satisfied for \"NOT\" logic operator as both are true hence doesn't return if value");
        }
        else{
            System.out.println("Case7: Yes, condition is satisfied for \"NOT\" logic operator,coz. both are true hence returned else value");
        }

//  Case8:

        boolean a8 = true;
        boolean b8 = false;
        if (a8 != b8){
            System.out.println("Case8: \"NOT\" logic operator returns if value coz. both are not equal");
        }
        else{
            System.out.println("Case8: \"NOT\" logic operator doesn't return else value coz. both are not true");
        }

    }
}
