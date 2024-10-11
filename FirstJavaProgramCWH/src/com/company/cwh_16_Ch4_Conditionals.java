package com.company;

public class cwh_16_Ch4_Conditionals {
    public static void main(String[] args) {
        byte age = 16;
        if(age >= 18) {
            System.out.println("Yes Boy, you can drive now");
        }
        else{
            System.out.println("No Boy, You can't drive yet");
        }

        byte age2 = 19;
        boolean conditon = (age2 == 19);
        if(conditon){
            System.out.println("Yes Boy,you can drive now");
        }
    }
}
