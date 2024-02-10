//Derek Hong

import java.util.Scanner;

public class Lecture07 {

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello, world!");
    // SELF-CHECK PROBLEMS:
    // Note: you will need to put some of your answers inside a comments

    // Put your answer for #3 here:
    /*
     * B. Scanner input = new Scanner(new File( "example.txt"));
     */
    // Put your answer for #5 here:
    // (The answer will be one of "A" or "B" or "C" or "D" or "E")
    /*
     * A. "welcome"
     * "to"
     * "the"
     * "matrix"
     */
    // Put your answer for #7 here:
    /*
     * 19
     */
    // EXERCISES:

    // Put your answer for #1 here:
    // You will need to add the method in above main(), but then call it here
    computeBoyGirlNames();
  }

  public static void computeBoyGirlNames() {
    int boy = 0;
    int boySum = 0;
    int girl = 0;
    int girlSum = 0;
    Scanner input = new Scanner("Erik 3 Rita 7 Tanner 14 Jillyn 13 Curtis 4 Stefanie 12 Ben 6");

    while (input.hasNext()) {
      input.next();
      boy++;
      boySum += input.nextInt();

      if (!input.hasNext()) {
        break;
      }

      input.next();
      girl++;
      girlSum += input.nextInt();
    }

    System.out.println(boy + " boys," + girl + " girls");
    System.out.println("The difference between boy's and girl's sums: " + Math.abs(boySum-girlSum));
  }
}
