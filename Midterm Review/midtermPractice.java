import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class midtermPractice {
    public static void main(String[] args) {
        for(int i = 1; i  <= 5; i++) {
            for(int j = 1; j <= (-1 * i + 5); j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    };

    public static void computeReservations() {
        int numReservations = 0;
        int peopleTotal = 0;
        try {
            Scanner input = new Scanner(new File("reservations.txt"));
            while (input.hasNext()) {
                input.next();
                numReservations++;
                peopleTotal += input.nextInt();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error Found");
        }
        System.out.println(numReservations + " reservations");
        System.out.println("Total number of people coming to the restaurant: " + peopleTotal);
    }
}
