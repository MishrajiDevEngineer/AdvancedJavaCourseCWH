package com.company;

public class cwh_04_Ch1_Literals {
    public static void main(String[] args) {
        byte age = 127;
        System.out.println(age);

        short age2 = 32767;
        System.out.println(age2);

        int age3 = 2147483647;
        System.out.println(age3);

        long ageDino = 9223372036854775807L;
        System.out.println(ageDino);

        float f1 = 999999.72036854775808f; //only call upto 6digit before decimal & 2digit after decimal
        System.out.println(f1);

        double d1 = 99999999999999223372036854775807d;
        System.out.println(d1);

        double d2 = 99999999; //can't store integer no. greater than 99999999
        System.out.println(d2);

        char ch = 'A';
        System.out.println(ch);

        boolean a = true;
        System.out.println(a);

        String str = "Mishraji";
        System.out.println(str);
    }
}
