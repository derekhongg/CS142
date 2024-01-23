/* Lecture 03
  Derek Hong
  CS142
*/
public class Lecture03 {

  public static void main(String[] args) {
    System.out.println(238%10);
    System.out.println("Hello, world!");
    // SELF-CHECK PROBLEMS:
    // Note: you will need to put some of your answers inside a comments

    // Put your answer for #3A here:
      /* 
      2+3*4-6: 3*4 comes first
      2+12-6: 2+12 next
      14-6: then last operation
      Ans: 8
      */
    // Put your answer for #3B here:
      /* 
      14 / 7 * 2 + 30 / 5 + 1: First breakdown
      2 * 2 + 30/5 + 1: multiply
      4 + 30/5 + 1: divide
      4+6+1: add together
      Ans: 11
      */
    // Put your answer for #3C here:
      /*
      (12 + 3) / 4 * 2: add parentheses first
      (15) / 4 * 2: then divide by 4 - whole numbers only
      3 * 2: then multiply
      Ans: 6
      */
    // Put your answer for #3D here:
      /* 
      (238 % 10 + 3) % 7: Mod first
      (8 + 3) % 7: add parentheses next
      (11) % 7: finish off operations
      Ans: 4
      */
    // Put your answer for #3E here:
      /*
      (18 - 7) * (43 % 10): execute parentheses
      (11) * (3): Execute operations
      Ans: 33
      */
    // Put your answer for #3F here:
      /* 
      2 + 19 % 5 - (11 * (5 / 2)): Parentheses first
      2 + 19 % 5 - (11 * 2): Execute paretheses
      2 + 19 % 5 - (22): Execute mod next
      2 + 4 - (22): Add next
      6 - 22: finish operations
      Ans: (-16)
      */
    // Put your answer for #3G here:
      /* 
      2 + 3 + "Mike" + 4: add first operation
      5+"Mike"+4: combine all together
      Ans: 5Mike4
      */
    // Put your answer for #7 here:
    /* 
    int age;
    boolean gender;
    double height;
    int weight;
    */
    // Make sure that the code that you write here compiles and runs

    // Put your answer for #18 here:
    // Make sure that the code that you write here compiles and runs
      int x = 2;
      double y = Math.pow((12.3 * x), 4) - Math.pow((9.1 * x), 3) + Math.pow((19.1 * x), 2) - (4.6 * x) + 34.2;
      System.out.println(y);
    // Put your answer for #21 in the static method
    // named "Exercise_21_Finish_Me" down below
    //
    // In order for the auto-graded tests to pass you MUST uncomment the next line:
    Exercise_21_Finish_Me(); // _UN_COMMENT THIS LINE!!!!

    // Put your answer for #25 here:
    /* 
    Output:
    24 1
    22 2
    19 3
    15 4
    10 5
    */
    // EXERCISES:

    // Put your answer for #4 here:
    for(int i = 1; i <= 3; i++) {
      for(int j = 1; j<=4; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    // Put your answer for #5 here:
    for(int i = 1; i<5; i++) {
      for(int j = 1; j<=i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    // Put your answer for #6 here:
    for(int i = 1; i<=7; i++) {
      for(int j = 1; j<=i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  // In VSCode you can press Ctrl/Cmd + / to uncomment a bunch of lines at once
  // (select the lines, then Ctrl+/)
  // public static void Exercise_21_Finish_Me() {
  // for (int i = /* FINISH ME */) {
  // System.out.println(/* FINISH ME */);
  // }
  // }

  public static void Exercise_21_Finish_Me () {
    for(int i = 1; i <= 4; i++) {
      System.out.println("2 times " + i + " = " + (i*2));
    }
  };

}
