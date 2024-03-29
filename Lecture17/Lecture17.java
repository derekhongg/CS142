// Derek Hong
// CS 142

public class Lecture17 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello, world!");
        // SELF-CHECK PROBLEMS:
        // Note: you will need to put some of your answers inside a comments

        // Put your answer for #10 here:
            /* 
            The legal statements are
            A
            B
            C
            D
            */
        // Put your answer for #12 here:
            /* 
            flute
            shoe 1
            flute 2

            flute 
            blue 1
            flute 2

            moo
            moo 1
            moo 2
            
            moo
            blue 1
            moo 2
            */
        // Put your answer for #13 here:
            /*  
            moo 2
            moo 1
            moo

            moo 2
            moo 1
            moo

            moo 2
            shoe 1
            moo

            moo 2
            flute 2
            moo
            */
        // Put your answer for #18 here:
            /*  
            Is-a relationship is a typ e of inheritence relationship where one class is a subtype of antoher class
            Has-a relationship is a type of composition relationship where one class has a reference to antother class as a member variable
            */
        // Put your answer for #19 here:
            /*  
            No, not good design to make a Square a subclass to the rectangle. A square is not a subtype of Rectangle in terms of behavior.
            */
        // Put your answer for #20 here:
            /*
            No, that's not a good design. The code will be too much and be difficult to manage. Also it would end up repeating itself too much.
            One better design would be to have a single Card class then using it's attributes to store details of the card, like rank and suit
            */
        // EXERCISES:

        // NOTE: Your program must compile and run,
        // and the code for all your exercises should be left UNcommented in the file.
        // In order to do that you should put any new classes that you create OUTSIDE
        // of main() even though there may be comments in main() saying to "Put your
        // answer for #5 here".
        // Instead, put code that tests / tries out / uses your classes in main(),
        // and keep the class definitions themselves outside of main().

        // Put your answer for #5
        // I.e., create a Ticket object, try calling the methods and printing out the
        // results, etc, etc

        // Put your answer for #6

        // Put your answer for #7

        // Put your answer for #8

        // Put your answer for #14
        /* 
            Example:
                    System.out.println("Rectangle Equality: " + rectangle1.equals(rectangle2));
                    System.out.println("Circle Equality: " + circle1.equals(circle2));
                    System.out.println("Triangle Equality: " + triangle1.equals(triangle2));
        */
    }
}

// Put your class definitions here
// NOTE: Do NOT mark them public

class Ticket {
    private int number;
    protected double price;

    public Ticket(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Number: " + number + ", price: " + price;
    }
}

class WalkupTicket extends Ticket {
    public WalkupTicket(int number) {
        super(number);
        price = 50;
    }
}


class AdvanceTicket extends Ticket {
    public AdvanceTicket(int number, int daysInAdvance) {
        super(number);
        if (daysInAdvance < 10) {
            price = 40;
        } else {
            price = 10;
        }
    }
}

class StudentAdvanceTicket extends AdvanceTicket {
    public StudentAdvanceTicket(int number, int daysInAdvance) {
        super(number, daysInAdvance);
        price = price / 2;
    }
}
