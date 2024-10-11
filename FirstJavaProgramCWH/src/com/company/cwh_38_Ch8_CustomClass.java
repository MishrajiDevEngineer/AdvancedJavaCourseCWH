package com.company;

class Employee{
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.format("The id and name of this client is %d and %s resprectively\n",id,name);
    }

    public int getSalary(){
        System.out.print("The salary of the client is: ");
        return salary;
    }
}

public class cwh_38_Ch8_CustomClass {
    public static void main(String[] args) {
        System.out.println("Creating our Custom Class named 'Employee'");
        Employee Mishraji = new Employee(); //initiating a new employee object using employee class
        Employee Rahul = new Employee();    //intiating a new employee obj using employee class

        // Setting attribute or propoerties of object
        // setting attribute of Mishraji
        Mishraji.id = 11;
        Mishraji.name = "Brijesh Mishra";
        Mishraji.salary = 20;

        // setting attribute of Rahul
        Rahul.id = 15;
        Rahul.name = "rahul Mishra";
        Rahul.salary = 30;

        // printing attribute of Mishraji
        Mishraji.printDetails();
        int mishrajiSalary = Mishraji.getSalary();
        System.out.println(mishrajiSalary);

        // printing attribute of Rahul
        Rahul.printDetails();
        int rahulSalary = Rahul.getSalary(); // this variable created due to the return statement doesn't have any variable to return back
        System.out.println(rahulSalary);  // after getting return of salary we print that salary here

    }
}
