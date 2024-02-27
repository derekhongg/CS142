//Derek Hong
//CS 142

public class Lecture14 {

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello, world!");
    // SELF-CHECK PROBLEMS:
    // Note: you will need to put some of your answers inside a comments

    // Put your answer for #1 here:
    /*
     * Procedural Programming:
     * • Code is organized sequentially
     * • Code is operated on routine and focuses on specific tasks
     * 
     * Object-Oriented Programming:
     * • Organizes code on objects, which holds the data and functions that operate
     * • Uses classes, sort of like a blueprint for creating the objects
     */
    // Put your answer for #2 here:
    /*
     * An object is an instance of a class
     * 
     * Class:
     * • A blueprint for the code and creates objects
     * • Defines structure and the how the object behaves
     * 
     * Object:
     * • Objects are created from classes and interact with each other
     */
    // Put your answer for #3 here:
    /*
     * • The state is the sequence of characters and the behavior is the methods,
     * ex. length
     */
    // Put your answer for #5 here:
    /*
     * • The state might include the number that has been computed and a memory
     * feature.
     * • The behavior might include methods to add, subtract, multiply, divide, and
     * some other advanced operations
     */
    // Put your answer for #8 here:
    /*
     * • Accessor provides the client access to data in the object
     * • A mutator lets the client change the object's state
     */
    // Put your answer for #7 here:
    // Review the class below
    // Put your answer for #11 here:
    /*
     * • Review below
     */
    // Put your answer for #14 here:
    /*
     * public String toString() {
     * return "java.awt.Point[x=" + x + ", y=" + y + "]";
     * }
     */
    // Put your answer for #15 here:
    /*
     * public String toString() {
     * return getNormalOrder();
     * }
     */
    // Put your answer for #16 here:
    /*
      // construct two Point objects, one at (8, 2) and one at (4, 3)
      Point p1 = new Point(8, 2);
      Point p2 = new Point(4, 3);
      
      // display the two Point objects' state
      System.out.println("p1 is " + p1);
      System.out.println("p2 is " + p2);
      
      // display p1 distance from origin
      System.out.println("p1's distance from origin is " +
      p1.distanceFromOrigin());
      
      // translate p1 to (9, 4)
      // translate p2 to (3, 13)
      p1.translate(1, 2);
      p2.translate(-1, 10);
      
      // display the two Point objects' state again
      System.out.println("p1 is now " + p1);
      System.out.println("p2 is now " + p2);
     */
    // EXERCISES:

    // Put your answer for #7 here:
    // You will need to add the method in Point.java,
    // and then create Point objects here to use (test) them

    // Put your answer for #8 here:
  }

  public class Name {
    String firstName;
    String lastName;
    char middleInitial;

    public String getNormalOrder() {
      return firstName + " " + middleInitial + " " + lastName;
    }

    public String getReverseOrder() {
      return lastName + ", " + firstName + " " + middleInitial + ".";
    }

    public String toString() {
      return firstName + " " + middleInitial + ". " + lastName;
    }
  }

}
