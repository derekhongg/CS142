//Derek Hong
//CS142
//This class keeps track of a grocery list of items

public class GroceryList {
    private GroceryItemOrder[] items;
    private int numItems;

    public GroceryList() {
        items = new GroceryItemOrder[10];
        numItems = 0;
    }

    public boolean add(GroceryItemOrder item) {
        for(int i = 0; i < 10; i++) {
            if(items[i] == null) {
                items[i] = item;
                numItems++;
                return true;
            }
        }
        return false;
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < numItems; i++) {
            totalCost += items[i].getCost();
        }
        return totalCost;
    }

    public String toString() {
        String output = "";

        for (GroceryItemOrder groceryItem : items) {
            output = output + groceryItem.toString() + "\n";
        }
        return output;
    }
}
