package com.company;

public class cwh_14_Ch3_StringMethods {
    public static void main(String[] args){
//  Methods to print String: 1)Directly using string datatype 2)Using String as a Class;
        String name = "Harry";
        String str = new String("Printing string using class,Harry");
        System.out.println(name);
        System.out.println(str);

//  Find length of string
        int value =  name.length();
        System.out.println(value);

//  Converting String to lowercase
        String lstring = name.toLowerCase();
        System.out.println(lstring);

//  Converting to Uppercase
        String ustring = name.toUpperCase();
        System.out.println(ustring);

//  Trimming non-Trimmed-String
        String nonTrimmedString = "     Harry        ";
        System.out.println(nonTrimmedString);
        String TrimmedString = nonTrimmedString.trim();
        System.out.println(TrimmedString);

//  Printing substring
        String subString = name.substring(2);
        System.out.println(subString);
        String newSubString = name.substring(0,3); //here 0 is index,while 3 is length;
        System.out.println(newSubString);

//  replace old char with new char in string
        String OldToNew = name.replace('r','p');
        System.out.println(OldToNew);
        String newOldToNew = name.replace("rry","ier");
        System.out.println(newOldToNew);
        System.out.println(name.replace("r","ier"));

//  Finding inside String start-with or end-with
        System.out.println(name.startsWith("Har"));
        System.out.println(name.startsWith("har"));
        System.out.println(name.endsWith("rry"));

//  Finding char at specific index
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(4));

//  index of first occurence
        String modifiedName = "Harryrryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("rr",4));

//  string for given index from last indexing
        System.out.println(modifiedName.lastIndexOf("rry"));
        System.out.println(modifiedName.lastIndexOf("rry",4));
        System.out.println(modifiedName.lastIndexOf("rry",9));

//  Checking equality of string
        System.out.println(name.equals("harry"));
        System.out.println(name.equals("Harry"));

//  Checking equality of string ignoring case
        System.out.println(name.equalsIgnoreCase("haRRY"));
        System.out.println(name.equalsIgnoreCase("hARrY"));


//  Type of Escape Sequence
        System.out.println("I am escape sequence \"double quote");
        System.out.println("I am escape sequence \\ for backslash");
        System.out.println("I am escape sequence \n new line");
        System.out.println("I am escape sequence \t for tab space");
        System.out.println("I am escape sequence \' for single quote");
    }
}