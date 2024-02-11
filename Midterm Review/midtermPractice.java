import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class midtermPractice {
    public static void main(String[] args) {
        computeReservations();
        System.out.println(3*4+5*6+7*(-2));
        System.out.println(1.5*2.0+(5.5/2)+5/4);
        System.out.println(23%5+31/4%3-17%(16%10));
        System.out.println("1"+2+3+"4"+5*6+"7"+(8+9));
        System.out.println(345 / 10 / 3 * 55 / 5 / 6 + 10 / (5 / 2.0));
        System.out.println(605/5/6+10/(2.5));
        
        System.out.println((5/2.0));
        System.out.println(1/2>0||4==9%5||1+1<1-1);
        
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
