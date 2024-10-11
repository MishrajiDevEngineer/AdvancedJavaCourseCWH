package com.company;
import java.util.Scanner;

class MyEmployee{
    private int id;
    private String name;

    //below method is called 'Setter' i.e setting parameter acc. to attribute recieved
    public void setName(String n){
        name = n;
    }

    //below method is called 'Getter' i.e Getting attribute through this parameter
    public String getName(){
        return name;
    }

    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}

class MyCircle{
    int radius;
    float pi;

    public void setRadius(int r){
        if (r > 0 ){
            System.out.println("radius is acceptable");
            radius = r;
        }
        else{
            System.out.println("only integer radius is acceptable");
        }
    }
    public void setPi(float picons){
        if (picons > 3.13 && picons < 3.15){
            System.out.println("pi value is acceptable");
            pi = picons;
        }
        else{
            System.out.println("Wrong pi value entered,please check correct pi value first");
        }
    }

    public float getArea(){
        return pi*radius*radius;
    }
    public float getPerimeter(){
        return 2*pi*radius;
    }
}

public class cwh_40_Ch9_AccessModifier_GetterSetter {
    public static void main(String[] args) {
        MyEmployee rahul = new MyEmployee();
        //rahul.id = 234;
        //rahul.name = "Rahul Mishra"; //getting error due to 'Private Access Modifier'

        //providing parameter attribute using 'Setter'
        rahul.setId(234);
        rahul.setName("Rahul Mishra");

        //getting attribute detail using 'Getter'
        System.out.println("The id of the employee is: "  + rahul.getId());
        System.out.println("The name of the employee is: " + rahul.getName());

/*
       problem1: self exercise to use getter and setter for a circle parameter to find area,perimeter and
       if the area or perimeter attribute detail is providing wrong then recieve a warning
*/
        MyCircle smartcircle = new MyCircle();
        Scanner scan = new Scanner(System.in);

        // providing attribute for circle
        System.out.println("Please enter the pi value");
        smartcircle.setPi(scan.nextFloat());
        System.out.println("Please enter the attribute for radius");
        smartcircle.setRadius(scan.nextInt());

        // getting area and perimeter acc. to provided attribute
        System.out.println("The area of circle acc. to attribute providied is: " + smartcircle.getArea());
        System.out.println("The perimeter of circle acc. to attribute provided is: " + smartcircle.getPerimeter());

    }
}
