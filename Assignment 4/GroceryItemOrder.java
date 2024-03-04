//Derek Hong
//CS 142

// This class stores information about a single grocery item being ordered.

public class GroceryItemOrder {

    String name;
    int quantity;
    double pricePerUnit;

    public GroceryItemOrder (String name, int quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    } 

    public double getCost() {
        return this.quantity * this.pricePerUnit;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        String output = quantity + " of " + name;
        return output;
    }
}
