public class Lecture15 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello, world!");
        // SELF-CHECK PROBLEMS:
        // Note: you will need to put some of your answers inside a comments

        // Put your answer for #18 here:
        /*
         * • Mismatch variable names
         * • Issues with scope, can only be accessible within the constructor and can't
         * be used outside of it
         */
        // Put your answer for #19 here:
        // See below
        // Put your answer for #20 here:
        /*
         * • It refers to the current instance of the class
         * 1. Refrencing instance variables
         * 2. Calling current objects method
         * 3. Pass the current object as a parameter
         */
        // Put your answer for #21 here:

        // Put your answer for #23 here:
        /*
         * The public keyword makes a class member accessible anywhere in the program.
         * It allows other classes and objects to access and modify the class.
         *
         * The private restricts the accessibility of a class member to only within the
         * class it's declared in.
         */
        // Put your answer for #24 here:

        /*
            Create an accessor method that returns the field's value
        */

        // Put your answer for #25 here:

        // Put your answer for #26 here:

        // Put your answer for #27 here:

        // Put your answer for #28 here:
            // When a class is encapsulated, clients cannot directly access its fields
            //Changing those fields won't disturb client behavior as long as the external view is consistent

        // EXERCISES:

        // Put your answer for #11 here:
        // You will need to add the method in BankAccount.java,
        // and then create objects here to use (test) them
        // in BankAccount.java
        // Put your answer for #12 here:
        // in BankAccount.java
        // Put your answer for #13 here:
        // in BankAccount.java
    }

    public Name (String firstName, char middleInitial, String lastName) {
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
    }
}
