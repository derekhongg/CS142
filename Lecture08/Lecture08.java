// Derek Hong

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lecture08 {

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello, world!");
    // SELF-CHECK PROBLEMS:
    // Note: you will need to put some of your answers inside a comments

    // Put your answer for #12 here:
    // NOTE: FIRST try to predict what the output will be WITHOUT actually running
    // the program
    // write down your answer here

    // NEXT run the program and see the results (you can copy-and-paste it here)
    // (I'm not including it in the starter project so that people don't just run
    // it as the first thing they do :) )

    // LASTLY compare the two results and if they're different go back and figure
    // out
    // why the computer's output is different from what you predicted.

    // Put your answer for #13 here:
    // (Do this like #5A - predict, write your prediction, run the code, then
    // explain any differences)

    /* 
    input: 6.7    The file has several input lines.
    input: 10 20          30  40
    input: test
    3 total
    */

    // Put your answer for #14 here:

    /* 
      nextInt(): 0 total - Program will end because there are no next ints on the first line
      nextDouble(): 1 total - will stop after first line
    */

    // Put your answer for #18 here:
    textBox();
    // EXERCISES:

    // Put your answer for #7 here:
    // You will need to add the method in above main(), but then call it here
    flipLines();
  }

  public static void textBox() {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a string to put in the box.");

    String text = input.nextLine();
    System.out.print("|");
    for(int i = -2; i < text.length(); i++) {
      System.out.print("-");
    }
    System.out.print("|\n");
    System.out.print("| "+text+" |\n");
    System.out.print("|");

    for(int i = -2; i < text.length(); i++) {
      System.out.print("-");
    }
    System.out.print("|\n");
  }

  public static void flipLines() {
    Scanner input = new Scanner(System.in);
    while (input.hasNextLine()) {
        String line = input.nextLine();
        if (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }
        System.out.println(line);
    }
}
}
