import java.util.*;

public class Assignment02 {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Woud you like to compare two or more birtdays?");
        System.out.println("Type 1 and then <enter/return> to compare two or more birthdays");
        System.out.println("Type 2 <enter/return> to end the program");

        int runProgram = 0;
        runProgram = console.nextInt();
        if(runProgram == 1) {
            runProgram();
        } else if(runProgram == 2) {
            System.out.println("End of Program.");
        } else {
            System.out.println("Please enter a valid number");
        }
        
    }

    public static void runProgram () {
        Scanner console = new Scanner(System.in);
        System.out.println("This program compares two birthdays");
        System.out.println("and displays which one is sooner");
        
        //TODAY
        System.out.println("What is today's month and day?");
        int month = console.nextInt();
        int day = console.nextInt();
        System.out.println("Today is " + month + "/" + day + "/2020, day #" + dayYear(month, day));
        int today = dayYear(month, day);

        //Person 1

        System.out.println("Person 1: ");
        System.out.print("What month and day were you born? ");
        month = console.nextInt();
        day = console.nextInt();
        System.out.println(month + "/" + day + "/2020, falls on day # " + dayYear(month, today) + " of 366");
        System.out.println("Your next birthday is in " + nextBirthday(today, month, day) + " day(s)");
        int person1 = nextBirthday(today, month, day);
        System.out.printf("That is %.0f percent of a year away.", percentageOfYear(today, month, day));
        System.out.println();
        
        //Person 2
        System.out.println("Person 2: ");
        System.out.print("What month and day were you born? ");
        month = console.nextInt();
        day = console.nextInt();
        System.out.println(month + "/" + day + "/2020, falls on day # " + dayYear(month, today) + " of 366");
        System.out.println("Your next birthday is in " + nextBirthday(today, month, day) + " day(s)");
        int person2 = nextBirthday(today, month, day);
        System.out.printf("That is %.0f percent of a year away.", percentageOfYear(today, month, day));
        System.out.println();

        compareBirthdays(person1, person2);
    }


    public static int daysMonth(int month) {
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 2) {
            return 29;
        } else {
            return 30;
        }
    }

    public static int dayYear (int month, int day) {
        int dayOfYear = 0;
        for (int i = 1; i < month; i++) {
            dayOfYear += daysMonth(i);
        }
        dayOfYear += day;
        return dayOfYear;
    }

    public static int nextBirthday(int today, int month, int date) {
        int daysUntilBDay = 0;
        if(dayYear(month, date) > today) {
            daysUntilBDay = dayYear(month, date) - today;
        } else if(dayYear(month, date) < today) {
            daysUntilBDay = 366 - (today - dayYear(month, date));
        }
        return daysUntilBDay;
    }

    public static double percentageOfYear(int today, int month, int date) {
        double percent = 0.0;
        if (dayYear(month, date) > today) {
            percent = ((double) (dayYear(month, date) - today) / (double) (366 - today));
        } else if (dayYear(month, date) < today) {
            percent = ((double) (366 - (today - dayYear(month, date))) / (double) today);
        }
        return percent * 100; // Multiply by 100 to get the percentage.
    }

    //Compare BDays
    public static void compareBirthdays(int person1, int person2) {
        if(person1 < person2) {
            System.out.println("Person's 1 birday is sooner.");
        } else if(person2 > person1) {
            System.out.println("Person's 2 birthday is sooner.");
        } else {
            System.out.println("You two have the same birthday!");
        }
    }
}
