// Derek Hong
// CS 142

import java.util.*;

public class Lecture18 {

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello, world!");
    // SELF-CHECK PROBLEMS:
    // Note: you will need to put some of your answers inside a comments

    // Put your answer for #22 here:
    /*
     * Implementing an interace means that a class agrees to proved the
     * implementation for all the methods defined in that interface.
     * Extending a class means that a subclass inherits the properties and behaviors
     * of the superclass, including its methods, variables, and implementation.
     */
    // Put your answer for #23 here:
    /*
     * In order for the code to class C to compile successfully, it must provide
     * implementations for all the methods defined in the interface.
     * Class C must implement m1() and m2() methods delcared in the interface I.
     */
    // Put your answer for #24 here:
      /* 
        There was no #24 listed in Canvas
      */
    // Put your answer for #25 here:
      /* 
        Review Point.java
      */
    // Put your answer for #26 here:
    /*
     * public interface Shape {
     * getSideCount();
     * }
     */
    // EXERCISES:

    // Put your answer for #15 in this repo:
      /* 
      Review Code Below
      */
    // Put your answer for #16 in this repo:
      /* 
      Review Code Below
      */
    // Put your answer for #18 in this repo:
      /* 
      Review Code Below
      */
  }

}

interface Shape {
  double getArea();
  double getPerimeter();
}

class Octogon implements Shape {
  private double side;

  public Octogon(double side) {
    this.side = side;
  }

  public double getArea() {
    return 2 * (1 + Math.sqrt(2)) * Math.pow(side, 2);
  }

  public double getPerimeter() {
    return 8 * side;
  }
}

class Hexagon implements Shape {
  private double side;

  public Hexagon(double sideLength) {
      this.side = sideLength;
  }
  public double getArea() {
      return (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
  }

  public double getPerimeter() {
      return 6 * side;
  }
}


interface Incrementable {
  void increment();
  int getValue();
}


class SequentialIncrementer implements Incrementable {
  private int value;

  public SequentialIncrementer() {
      this.value = 0;
  }

  public void increment() {
      value++;
  }

  public int getValue() {
      return value;
  }
}

class RandomIncrementer implements Incrementable {
  private int value;
  private Random random;

  public RandomIncrementer() {
      this.random = new Random();
      this.value = random.nextInt();
  }

  public void increment() {
      value = random.nextInt();
  }

  public int getValue() {
      return value;
  }
}