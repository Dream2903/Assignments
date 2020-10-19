import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;



//Bygger videre på en opgave i : Arv -> src -> ItemHome.java



//Superclass
class Item {

    //Variables
    String name;
    double price;

    //Method
    Item (String name, double price) {

        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}




//Subclass of Item
class FoodItem extends Item {

    //Variable / Attribute
    Date expires;

    //Constructor
    FoodItem (String name, double price, Date expires) {
        super(name, price);
        this.expires = expires;
    }
    //Method
    public Date getExpires () {
        return expires;
    }
    @Override
    public String toString () {
        return "FoodItem name " + name + " price " + price + " expires " + expires;
    }
}




//Subclass of Item
class NonFoodItem extends Item {

    //Variable / Attributer
    String[] materials;

    //Constructor
    NonFoodItem(String name, double price, String[] materials) {
        super(name, price);
        this.materials = materials;
    }

    public String[] getMaterials() {
        return materials;
    }

    @Override
    public String toString() {
        return name + " " + price + " price " + Arrays.toString(materials);
    }
}





class MainTwo {
    public static void main(String[] args) {
        FoodItem [] items = new FoodItem[10];

        //For loop for FoodItem
        for (int i = 0; i < items.length; i++) {
            items[i] = new FoodItem("Chicken", 5.0, new Date());
        }
        for (int j = 0; j < items.length; j++) {
            System.out.println(items[j].toString());
        }


        NonFoodItem [] items1 = new NonFoodItem[10];

        //For loop for NonFoodItem
        for (int x = 0; x < items1.length; x++) {
            items1[x] = new NonFoodItem("Puzzles", 10.0, new String[]{"Brian is the man!"});
        }
        for (int y = 0; y < items1.length; y++) {
            System.out.println(items1[y].toString());
        }

        //Array
        ArrayList <Item> ItemList = new ArrayList <Item>();

        //Adds 5 new (FoodItem) items to the list
        for (int i = 0 ; i < 5 ; i++) {
            ItemList.add(items[i]);
        }
        //Adds 5 new (NonFoodItem) item to the list
        for (int j = 0 ; j < 5 ; j++) {
            ItemList.add(items1[j]);
        }
    }

class Inventory {

    //Array
    ArrayList<Item> items;

    //Constructor
    Inventory(ArrayList<Item> items) {
        this.items = items;
    }

    //Method
    public void addItem(Item item) {
        items.add(item);
    }


    //Method
    public void removeItem (Item item) {
        items.remove(item);
    }

    //Method
    double getInventoryValue () {
        double sum = 0.0;

        //Adds the value of all the items
        for (Item item: items) {
            sum += item.getPrice();
        }

        //value of all the items
        return sum;
    }

    public void printInventory () {
        System.out.println("The inventory is filled with: ");

        for (Item item: items) {
            System.out.println(" + " + item);
        }
    }
    }
}
