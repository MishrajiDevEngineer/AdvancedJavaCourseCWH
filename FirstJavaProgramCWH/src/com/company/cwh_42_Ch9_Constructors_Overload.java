package com.company;

class MyMainEmployee{
    int id;
    String name;

    public MyMainEmployee(){
        id = 11;
        name = "Harry";
    }
    public MyMainEmployee(String myName){
        id = 12;
        name = myName;
    }
    public MyMainEmployee(String myName,int myId){
        id = myId;
        name = myName;
    }

    public void setName(String n){
        name = n;
    }

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

public class cwh_42_Ch9_Constructors_Overload{
    public static void main(String[] args) {
        MyMainEmployee mishraji = new MyMainEmployee();

/*
        MyMainEmployee mishraji = new MyMainEmployee();
        mishraji.setId(32);
        mishraji.setName("Brijesh Mishra");
        System.out.println(mishraji.getId());
        System.out.println(mishraji.getName());

//Imp. Question: if i don't want to set and get attribute of class MyMainEmployee then what should we do
        // Ans: Use Constructor to automatically invoke the parameter inside constructor by creating constructor,as same name as custom class
*/

        //Here constructor of MyMainEmployee is automatically invoke and print the id and name
        System.out.println(mishraji.getId());
        System.out.println(mishraji.getName());

        //Lets invoke overloaded constructor by passing attribute inside class obj.
        mishraji = new MyMainEmployee("CodeWithHarry");
        System.out.println(mishraji.getId());
        System.out.println(mishraji.getName());

        mishraji = new MyMainEmployee("Rahul Mishra",45);
        System.out.println(mishraji.getId());
        System.out.println(mishraji.getName());

        mishraji = new MyMainEmployee("Sanket Mahtre");
        System.out.println(mishraji.getName());
    }
}
