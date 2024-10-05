import java.util.ArrayList;

public class ShoppingCart {
    private static ShoppingCart instance;
    private ArrayList<String> items;

    // hide the constructor
    private ShoppingCart() {
        items = new ArrayList<String>();
    }

    // static method is the only way to access the instance
    public static ShoppingCart getInstance() {
        if (instance == null) {
            instance = new ShoppingCart();
        }
        return instance;
    }

    public void addItem(String item) {
        items.add(item);
    }

    public ArrayList<String> getItems() {
        return items;
    }
}