import java.util.Arrays;

public class Lecture13 {

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello, world!");
    // SELF-CHECK PROBLEMS:
    // Note: you will need to put some of your answers inside a comments

    // Put your answer for #22 here:
    /*
     * {20, 30, 40, 50, 60, 70, 80, 90, 100, 100}
     */
    // Put your answer for #23 here:
    /*
     * {10, 10, 10, 10, 10, 10, 10, 10, 10, 10}
     */
    // Put your answer for #28A here:
      /* 
      {8}
      */
    // Put your answer for #28B here:
      /* 
      {14, 8}
      */
    // Put your answer for #28C here:
      /* 
      Error
      */
    // Put your answer for #28D here:
      /* 
      {10, 9, 10, 6, 5}
      */
    // Put your answer for #28E here:
      /* 
      {12, 12, 11, 11, 9, 8}}
      */
    // EXERCISES:

    // Put your answer for #7 here:
    // You will need to add the method above main(), but then call it here

    // Put your answer for #11 here:
  }

  public static void mystery5(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] > nums[i + 1]) {
        nums[i + 1]++;
      }
    }
  }

  public static int kthLargest(int k, int[] arr) {
    int[] sortedArray = Arrays.copyOf(arr, arr.length);

    Arrays.sort(sortedArray);

    return sortedArray[arr.length - 1 - k];
  }

  public static boolean isUnique(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          return false;
        }
      }
    }
    return true;
  }
}
