// Cameron Chen
// IT CS 142

import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_DIGITS = 25;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("sum.txt"));
        readFile(in);
    }

    // READ AND PROCESS TEXT FILE
    public static void readFile(Scanner in) throws FileNotFoundException {
        in = new Scanner(new File("sum.txt"));
        int lineCount = 0;
        // READ LINE
        while (in.hasNextLine()) {
            String line = in.nextLine();
            Scanner input = new Scanner(line);
            int[] sum = new int[MAX_DIGITS];
            // READ TOKEN W/IN LINE
            while (input.hasNext()) {
                String number = input.next();
                System.out.print(number + " ");
                if (input.hasNext()) {
                    System.out.print("+ ");
                }
                // CONVERT NUMBERS TO ARRAYS OF DIGITS AND ADD TOGETHER
                int[] num = convertToArray(number);
                sum = addArrays(sum, num);
            }
            lineCount++;
            System.out.println("= " + convertToString(sum));
        }
        System.out.println();
        System.out.println("Total lines: " + lineCount);
    }

    // CONVERT STRING(S) TO ARRAYS
    public static int[] convertToArray(String number) {
        int[] digit = new int[MAX_DIGITS];
        // SET ARRAY CONTENT VALUES TO 0 UNTIL LENGTH OF #
        for (int i = 0; i < MAX_DIGITS - number.length(); i++) {
            digit[i] = 0;
        }
        // SET REMAINING VALUES TO DIGITS OF #
        for (int i = MAX_DIGITS - number.length(); i < MAX_DIGITS; i++) {
            digit[i] = Character.getNumericValue(number.charAt(i - (MAX_DIGITS - number.length())));
        }
        return digit;
    }

    // ADD ARRAYS TOGETHER
    public static int[] addArrays(int[] a, int[] b) {
        int sum = 0;
        int carryOne = 0;
        int[] sumArray = new int[25];
        for (int i = MAX_DIGITS - 1; i >= 0; i--) {
            sum = a[i] + b[i] + carryOne;
            if (sum <= 9) {
                sumArray[i] = sum;
                carryOne = 0;
            } else if (sum > 9) {
                sumArray[i] = sum - 10;
                carryOne = 1;
            }
        }
        return sumArray;
    }

    // CONVERT ARRAY BACK TO STRING
    public static String convertToString(int[] a) {
        String convert = "";
        for (int i = 0; i < MAX_DIGITS; i++) {
            convert += Integer.toString(a[i]);
        }
        // REMOVE LEADING ZEROS
        for (int i = 0; i < convert.length(); i++) {
            if (convert.charAt(i) != '0') {
                String noZeros = convert.substring(i);
                return noZeros;
            }
        }
        return "0";
    }
}