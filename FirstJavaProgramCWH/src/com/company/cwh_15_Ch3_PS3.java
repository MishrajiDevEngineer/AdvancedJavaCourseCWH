package com.company;

import java.util.Scanner;

public class cwh_15_Ch3_PS3 {
    public static void main(String[] args) {
//        Problem1:Convert to lowercase not to print
        String name = "Brijesh Mishra";
        name = name.toLowerCase();
        // System.out.println(name);

//        problem 2: Replace spaces with underscore
        String text = "To Lower   Case";
        text = text.replace(" ","_");
        System.out.println(text);

//        problem 3: Replace <|name|> with any word you want to replace
        String letter = "Dear <|name|> Thanks a lot!";
        letter = letter.replace("<|name|>","Mishraji");
        System.out.println(letter);

//        problem 4: Detect text spaces
        String DetectTextSpace = "This  String contain double   and   triple spaces ";
        System.out.println(DetectTextSpace.indexOf("  "));
        System.out.println(DetectTextSpace.indexOf("   "));
        System.out.println(DetectTextSpace.indexOf("    "));

//        problem 5: format in letter format
        String LetterFormat = "Dear Harry,This Java Course is very nice.Thanks!";
        LetterFormat = "Dear Harry,\n\tThis java Course is very nice.\n\tThanks!";
        System.out.println(LetterFormat);
    }
}