package com.company;

class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

}

class Cellphone{
    public void callFriend(){
        System.out.println("Calling Panditji...");
    }

    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void ring(){
        System.out.println("Ringing...");
    }
}

class Square{
    int side;

    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    int length;
    int breadth;

    public int area(){
        return length * breadth;
    }

    public int perimeter(){
        return 2*(length + breadth);
    }
}

class TommyVicity{
    public void hitting(){
        System.out.println("Player started hitting toward oponent...");
    }
    public void firing(){
        System.out.println("Player has started firing toward oponent...");
    }
    public void running(){
        System.out.println("Player running from the oponent due to fear of losing...");
    }
}

class Circle{
    int radius;
    float pi;

    public float perimeter(){
        return 2*pi*radius;
    }
    public float area(){
        return pi*radius*radius;
    }
}
public class cwh_39_Ch8_PS {
    public static void main(String[] args) {
/*
        // Problem1: Create class employee with foll. properties and methods
        * Salary (property)(int)
        * getSalary (method returning salary)
        * name (property)(String)
        * getName (method returning String)
        * setName (method changing name)
*/
        Employee1 mishraji = new Employee1();
        mishraji.setName("Brijesh Mishra");
        System.out.println(mishraji.getName());
        mishraji.salary = 666; //setting salary for mishraji in Employee1 class
        System.out.println(mishraji.getSalary());


        //problem2: create cellphone class with method to print "ringing...","vibrating...","calling..."
        Cellphone vivo = new Cellphone();
        vivo.callFriend();
        vivo.vibrate();
        vivo.ring();

        //Problem3: create square class with method to initialise,print area and perimeter
        Square sq = new Square();
        sq.side = 3;
        System.out.println("The area of square is: " + sq.area());
        System.out.println("The perimeter of square is: " + sq.perimeter());

        //problem4: repeat problem3 for rectangle
        Rectangle rec = new Rectangle();
        rec.length = 5;
        rec.breadth = 4;
        System.out.println("The area of rectangle is: " + rec.area());
        System.out.println("The perimeter of rectangle is: " + rec.perimeter());

        //problem5: create tommyvicity class as rockstar games,capable of hitting,firing and running...
        TommyVicity player1 = new TommyVicity();
        player1.hitting();
        player1.firing();
        player1.running();

        //problem6: repeat4 for a circle
        Circle cr = new Circle();
        cr.radius = 3;
        cr.pi = 22/7f;
        System.out.println("The perimeter of Circle is: " + cr.perimeter());
        System.out.println("The area of Circle is: " + cr.area());

    }
}
