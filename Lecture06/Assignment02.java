// Derek Hong
// CS 142

import java.util.*;

public class Assignment02 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Would you like to compare two or more birtdays?");
        System.out.println("Type 1 and then <enter/return> to compare two or more birthdays");
        System.out.println("Type 2 <enter/return> to end the program");

        int runProgram = 0;
        runProgram = console.nextInt();
        if (runProgram == 1) {
            runProgram();
        } else if (runProgram == 2) {
            System.out.println("End of Program.");
        } else {
            System.out.println("Please enter a valid number");
        }

    }

    public static void runProgram() {
        Scanner console = new Scanner(System.in);
        System.out.println("This program compares two birthdays");
        System.out.println("and displays which one is sooner");

        // TODAY
        System.out.println("What is today's month and day?");
        int month = console.nextInt();
        int day = console.nextInt();
        System.out.println("Today is " + month + "/" + day + "/2020, day #" + dayYear(month, day));
        int today = dayYear(month, day);

        // Person 1

        System.out.println("Person 1:");
        System.out.print("What month and day were you born? ");
        month = console.nextInt();
        day = console.nextInt();
        if(today == dayYear(month, day)) {
            System.out.println("Happy Birthday!");
        }

        System.out.println(month + "/" + day + "/2020 falls on day #" + dayYear(month, day) + " of 366");
        System.out.println("Your next birthday is in " + nextBirthday(today, month, day) + " day(s).");
        int person1 = nextBirthday(today, month, day);
        System.out.printf("That is %.1f percent of a year away.", percentageOfYear(today, month, day));
        System.out.println();

        // Person 2
        System.out.println("Person 2: ");
        System.out.print("What month and day were you born? ");
        month = console.nextInt();
        day = console.nextInt();
        if(today == dayYear(month, day)) {
            System.out.println("Happy Birthday!");
        }
        System.out.println(month + "/" + day + "/2020 falls on day #" + dayYear(month, day) + " of 366");
        System.out.println("Your next birthday is in " + nextBirthday(today, month, day) + " day(s).");
        int person2 = nextBirthday(today, month, day);
        System.out.printf("That is %.1f percent of a year away.", percentageOfYear(today, month, day));
        System.out.println();

        compareBirthdays(person1, person2);
    }

    public static int dayYear(int month, int day) {
        int daysMonth = 0;
        int sumDays = 0;
        int numDays = 0;
        if (month > 1) {
            for (int i = 0; i < month; i++) {
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    daysMonth = 31;
                } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                    daysMonth = 30;
                } else if (i == 2) {
                    daysMonth = 29;
                }
                sumDays = sumDays + daysMonth;
            }
            numDays = sumDays + day;
        } else if (month == 1) {
            numDays = day;
        }
        return numDays;
    }

    public static int nextBirthday(int today, int month, int date) {
        int daysUntilBDay = 0;
        if (dayYear(month, date) > today) {
            daysUntilBDay = dayYear(month, date) - today;
        } else if (dayYear(month, date) < today) {
            daysUntilBDay = 366 - (today - dayYear(month, date));
        }
        return daysUntilBDay;
    }

    public static double percentageOfYear(int today, int month, int date) {
        double percent = 0.0;
        if (dayYear(month, date) > today) {
            percent = (((double) (dayYear(month, date) - today) / (double) 366)) * 100;
        } else if (dayYear(month, date) < today) {
            percent = (((double) (366 - (today - dayYear(month, date))) / (double) 366)) * 100;
        }
        return percent;
    }

    // Compare BDays
    public static void compareBirthdays(int person1, int person2) {
        if (person1 < person2) {
            System.out.println("Person's 1 birday is sooner.");
        } else if (person1 > person2) {
            System.out.println("Person's 2 birthday is sooner.");
        } else {
            System.out.println("Wow, you share the same birthday!");
        }
    }
}
