public class Lecture11 {

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello, world!");
    //

    // SELF-CHECK PROBLEMS:
    // Put your answer for #2A here:
    /*
     * numbers[0];
     */
    // Put your answer for #2B here:
    /*
     * numbers[9];
     */
    // Put your answer for #2C here:
    /*
     * Use numbers[-1]
     */
    // Put your answer for #3 here:
    int arr[] = { 27, 51, 33, -1, 101 };
    // Put your answer for #5 here:
    // [0, 4, 11, 0, 44, 0, 0, 2]
    // Put your answer for #11 here:
    // See method below
    // EXERCISES:
    // None for this lecture
  }

  public static double mean(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += i;
    }

    return (double) sum / arr.length;
  }
}
