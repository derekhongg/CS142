//Derek Hong
//CS 142

import java.util.*;
import java.io.*;

public class Lecture16 {

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello, world!");
    // SELF-CHECK PROBLEMS:
    // Note: you will need to put some of your answers inside a comments

    // Put your answer for #1 here:
      /* 
        the practice of writing a code once and using it many times in different contexts
      */
    // Put your answer for #2 here:
      /* 
        •Overloading: occurs when one class method contains multiple methods that have the same name but different parameters
        •Overriding: Occurs when a subclass substitutes its own version of an inherited method that uses exactly the same name and same parameters
      */
    // Put your answer for #3 here:
      /* 
        public class A extends B{

        }
      */
    // Put your answer for #4 here:
        /* 
        The super keyword refers to a class' superclass.
        This keyword refers to the variable or constructor within the class
        Each should be used based on what you want to call
        */
    // Put your answer for #5 here:
        /* 
        UndergraduateStudent can call the setAge method but can't access the name or age fields from Student.
        */
    // Put your answer for #6 here:
        /* 
          public UndergraduateStudent(String name) {
            super(name, 18);
            year = 0;
          }
        */
    // Put your answer for #7 here:
        /* 
          public void setAge(int age) {
            super.setAge(age);
            year++;
          }
        */
    // Put your answer for #8 here:
        /* 
        vroom
        car 1
        car 2
        vroom
        truck 1
        car 2
        */
    // Put your answer for #9 here:
        /* 
          vroomvroom
          truck 1
          car 1
        */
    // EXERCISES:

    // Put your answer for #1 in this repo

    // Put your answer for #2 in this repo
  }
  public class Marketer extends Employee {
    public void advertise() {
      System.out.println("Act now, while supplies last");
    }
    public double getSalary() {
      return super.getSalary() + 10000.00;
    }
  }
  public class Janitor extends Employee {
    public int getHours() {
        return 2 * super.getHours();
    }
    
    public double getSalary() {
        return super.getSalary() - 10000;
    }
    
    public int getVacationDays() {
        return super.getVacationDays() / 2;
    }
    
    public void clean() {
        System.out.println("Workin' for the man.");
    }
}
}
