import java.util.Scanner;

public class AssignedAsciiArt {
    // the size of the needle

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("What size space needle would you like to see? ");
        int size = in.nextInt();
        makeSpaceNeedle(size);
    }
    
    public static void makeSpaceNeedle(int SIZE) {
        needle(SIZE);
        top(SIZE);
        floor(SIZE);
        bottomDome(SIZE);
        needle(SIZE);
        stem(SIZE);
        top(SIZE);
        floor(SIZE);
    }

    public static void needle(int SIZE) {
        for (int rows = 1; rows <= SIZE; rows++) {
            // this will print the number of spaces before the needle starts
            for (int j = 0; j < 3 * SIZE; j++) {
                // there are 3 times size of spaces
                System.out.print(" ");
            }
            // once the spaces end, it will print the lines until the size stops
            System.out.println("||");
        }
    }

    public static void top(int SIZE) {
        // the number of rows the dome will last is constant
        for (int rows = 1; rows <= SIZE; rows++) {
            // ex. 3*3(SIZE) - 3*1 = 5 - num of spaces before __/
            for (int i = 1; i <= ((3 * SIZE) - (3 * rows)); i++) {
                System.out.print(" ");
            }
            // After the spaces for the loop end, it will start printing the top part "__/"
            System.out.print("__/");
            // depending on the row, only prints a cerain amount of :
            for (int i = 1; i <= ((3 * rows) - ((3))); i++) {
                System.out.print(":");
            }
            System.out.print("||");
            for (int i = 1; i <= ((3 * rows) - ((3))); i++) {
                System.out.print(":");
            }
            System.out.print("\\__");
            System.out.println();
        }
    }

    public static void floor(int SIZE) {
        // it always starts with a "|"
        System.out.print("|");
        // always divisble by 6 and have to print the quotes
        for (int i = 1; i <= 6 * SIZE; i++) {
            System.out.print("\"");
        }
        System.out.print("|");
        System.out.println();
    }

    public static void bottomDome(int SIZE) {
        for (int rows = 1; rows <= SIZE; rows++) {
            // depending on the number of rows, it will only print a certain amount of lines
            for (int i = 1; i <= (2 * rows) - 2; i++) {
                System.out.print(" ");
            }
            System.out.print("\\_");
            for (int j = 1; j <= (((3 * SIZE) + 1) - (2 * rows)); j++) {
                System.out.print("/\\");
            }
            System.out.print("_/");
            System.out.println();
        }
    }

    public static void stem(int SIZE) {

        String percentageSign = "";

        for (int lines = 1; lines <= SIZE * SIZE; lines++) {
            percentageSign = "";
            for (int i = 0; i <= SIZE * 3 - SIZE; i++) {
                System.out.print(" ");
            }
            // this will add a percentage signs if the size is greater than 2
            for (int j = 1; j <= SIZE - 2; j++) {
                percentageSign += "%";
            }
            System.out.println("|" + percentageSign + "||" + percentageSign + "|");
        }
    }
}