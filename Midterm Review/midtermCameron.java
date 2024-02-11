import java.util.Scanner;
import java.io.*;
import java.util.*;

public class midtermCameron {
    public static void main(String[] args) {
        favoriteLetter();
    }
    public static void favoriteLetter(Scanner console, String letter) {
        System.out.println("Looking for two" + letter + " words in row.");
        int count = 0;
        String word = "";
        while(console.hasNext()) {
            System.out.print("Enter a word: ");
            word =console.next();
            if(word.startsWith(letter)) {
                count++;
            }
            if(count == 2) {
                break;
            }
        }
        System.out.println(letter + "is for \"" + console + "\"");
    }
}
