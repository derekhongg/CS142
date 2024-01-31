import java.util.Scanner;

public class Lecture06 {

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello, world!");
    // SELF-CHECK PROBLEMS:
    // Note: you will need to put some of your answers inside a comments

    // Put your answer for #5A here:
    // NOTE: FIRST try to predict what the output will be WITHOUT actually running the program
    // write down your answer here
    /* 
      Loop will run 9 times
    */
    // NEXT run the program and see the results (you can copy-and-paste it here)
    // (I'm not including it in the starter project so that people don't just run
    //  it as the first thing they do :)  )
    /* 
      Loop runs 10 times
    */

    // LASTLY compare the two results and if they're different go back and figure out
    // why the computer's output is different from what you predicted.

    // Put your answer for #5B here:
    // (Do this like #5A - predict, write your prediction, run the code, then explain any differences)
    /* 
      Prediction: Loop will run zero times
      Actual Answer: Loop runs zero times because max starts off equal to 10
    */
    // Put your answer for #5C here:
    /* 
      Predicted Answer:
        1. a
        2. bab word.length = 3
        3. bbabb  word.length = 5
        4. bbbabbb word.length = 7
        5. bbbbabbbb word.length = 9
        6. bbbbbbabbbbbb word.length = 11;
      Actual Answer: bbbbbabbbbb
    */
    // Put your answer for #6 here:
    /* 
      *import random*
      Random num = new Random();
      int randomNum = num.nextInt(10) + 1;
    */
    // Put your answer for #7 here:
    // Instead of correcting the code write a brief explanation of how to fix it
    // and include only the lines that you'll change

    /* 
    int oddNum = random.nextInt(95) + 5;
    if(oddNum % 2 != 0) {
      System.out.println(oddNum);
    } else {
      return false;
    }
    
    */

    // Put your answer for #9 here:
      /*  Scanner console = new Scanner(System.in);
          String input;
          do{
            System.out.println("She sells seashells by the seashore.");
            System.out.print("Do you want to hear it again?");
            input = console.nextLine();
          } while(input.equals("y"));
      */
    // Put your answer for #12 here:

    /* public static void main(String[] args) {
        printletters("Rabbit");
        }

      public static void printletters(String text) {
        System.out.print(text.charAt(0));
        for (int i = 1; i< text.length(); i++)  {
          System.out.print("-" + text.charAt(i));
        }
        System.out.println(); // to end the line of output
      }
    */

    // Put your answer for #16 here:
    /* public static boolean isPrime (int n) {
      boolean prime = true;
      for (int i=2; i < n; i++) {
        if (n % i == 0) {
            prime = false;
          }
        }
      return prime;
      } 
    */
    // EXERCISES:

    // Put your answer for #1 here:
    // You will need to add the method in above main(), but then call it here
      /* 
      public staic void showTwo(int num) {
        System.out.println(num + "= ");
        while(num%2 == 0) {
          System.out.print("2 * ");
          num /= 2;
        }
        System.out.println(n);
      }
      
      */
    // Put your answer for #12 here:
/*    public static void main (String[] args) {
        printAvg();
      };

      public static void printAvg() {
        Scanner console = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num = console.nextInt();
      
        if(num < 0) {
          return;
        }
        int sum = 0;
        int count = 0;
        do{
          sum += num;
          count++;

          System.out.print("Type a number: ");
          num = console.nextInt();
          } while(num >= 0);
        System.out.println("Average was " + (1.0 * sum/count));
        } 
      */
  }
}
