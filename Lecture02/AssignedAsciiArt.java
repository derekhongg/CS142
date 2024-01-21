public class AssignedAsciiArt {

    // Declares a constant controlling
    // the size of the needle
    public static final int SIZE = 4;

    public static void main (String[] args) {
        needle();
        top();
        floor();
        bottomDome();
        needle();
        stem();
        top();
        floor();
    }

    public static void needle() {
        for (int rows = 1; rows <= SIZE; rows++) {
            //this will print the number of spaces before the needle starts
            for (int j = 0; j < 3*SIZE; j++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }

    public static void top() {
        for (int rows = 1; rows <= SIZE; rows++) {
            //
            for(int i = 1; i<=((3*SIZE) - (3*rows)); i++) {
                System.out.print(" ");
            }
            //After the spaces for the loop end, it will start printing the top part "__/"
            System.out.print("__/");
            for(int i = 1; i<=((3*rows) - ((3))); i++) {
                System.out.print(":");
            }
            System.out.print("||");
            for(int i = 1; i<=((3*rows) - ((3))); i++) {
                System.out.print(":");
            }
            System.out.print("\\__");
            System.out.println();
        }
    }

    public static void floor() {
        System.out.print("|");
        for (int i = 1; i <= 6 * SIZE; i++) {
            System.out.print("\"");
        }
        System.out.print("|");
        System.out.println();
    }

    public static void bottomDome() {
        for(int rows = 1; rows <= SIZE; rows++) {
            for(int i = 1; i <= (2* rows) - 2; i++) {
                System.out.print(" ");
            }
            System.out.print("\\_");
            for(int j = 1; j <= (((3*SIZE) + 1) - (2 * rows)); j++) {
                System.out.print("/\\");
            }
            System.out.print("_/");
            System.out.println();
        }
    }

    public static void stem() {

        String percentageSign = "";
        
        for (int lines = 1; lines <= SIZE * SIZE; lines++) {
            percentageSign = "";
            for (int i = 0; i <= SIZE * 3 - SIZE; i++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= SIZE - 2; j++) {
                percentageSign += "%";
            }
            System.out.println("|" + percentageSign + "||" + percentageSign + "|");
        }
    }
}