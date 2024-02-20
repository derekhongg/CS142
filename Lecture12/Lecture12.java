public class Lecture12 {

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello, world!");
    //

    // SELF-CHECK PROBLEMS:
    // Put your answer for #14 here:
      /* 
      [3, 27, 9, -6, 7, 1]
      */
    // Put your answer for #15 here:
      /* 
      System.out.println(printBackwards(arr));
      */
    // Put your answer for #17 here:
      /* 
      See method below
      */

    // EXERCISES:

    // Put your answer for #1 here:
      /* 
      See method below
       */
    // Put your answer for #3 here:
      /* 
      See method below
       */
    // Put your answer for #4 here:
      /* 
      See method below
      */
  }
  public static void printBackwards (int[] arr) {
    int[] list = {2, 18, 6, -4, 5, 1};
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;

      start++;
      end--;
    }
  }

  public static boolean allLess(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      if(arr1[i] > arr2[i]) {
        return false;
      }
    }
    return true;
  }

  public static int lastIndexOf (int[] arr, int value) {
    for(int i = arr.length -1; i >= 0; i--) {
      if(arr[i] == value) {
        return i;
      }
    }
    return -1; 
  }

  public static int countInRange (int[] arr, int min, int max) {
    int count = 0;

    for(int i = 0; i < arr.length; i++) {
      if(i >= min && i <= max) {
        count++;
      }
    }
    return count;
  }

  public static boolean isSorted(double[] arr) {
    for(int i = 0; i < arr.length - 1 ; i++) {
      if(arr[i] > arr[i + 1]) {
        return false;
      }
    }
    return true;
  }
}
