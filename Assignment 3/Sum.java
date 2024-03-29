//Derek Hong
//CS 142

import java.io.*;
import java.util.*;

public class Sum {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("sum.txt"));
            processInput(input);
            input.close();
        } catch (Exception error) {
            System.out.println("Error opening file\n");
            return;
        }
    }

    public static final int MAX_DIGITS = 25;

    public static void processInput(Scanner input) {
        int[] answer = new int[MAX_DIGITS];
        int[] temp = new int[MAX_DIGITS];

        for (int i = 0; i < MAX_DIGITS; i++) {
            answer[i] = 0;
            temp[i] = 0;
        }
        int numLines = 0;
        while (input.hasNextLine()) {
            numLines++;
            for (int j = 0; j < MAX_DIGITS; j++) {
                answer[j] = 0;
            }
            String str = input.nextLine();
            String[] data = str.split(" ");
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < MAX_DIGITS; j++) {
                    temp[j] = 0;
                }
                int startIndex = MAX_DIGITS - data[i].length();
                for (int j = 0; j < data[i].length(); j++) {
                    temp[startIndex + j] = Character.getNumericValue(data[i].charAt(j));
                }
                int carryOver = 0;
                for (int k = MAX_DIGITS - 1; k >= 0; k--) {
                    int n = answer[k];
                    answer[k] = answer[k] + temp[k] + carryOver;
                    if (n + temp[k] + carryOver > 9) {
                        carryOver = 1;
                        answer[k] = answer[k] % 10;
                    } else
                        carryOver = 0;
                }
            }
            for (int i = 0; i < data.length; i++) {
                if (i < data.length - 1)
                    System.out.print(data[i] + " + ");
                else
                    System.out.print(data[i] + " = ");
            }
            int start = 0;
            for (int i = 0; i < MAX_DIGITS; i++) {
                if (answer[i] > 0)
                    start = 1;
                if (start == 1)
                    System.out.print(answer[i]);
            }
            System.out.println();
        }
        System.out.println("Total Lines: " + numLines);
    }
}
