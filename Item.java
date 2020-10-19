import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;

class Item {
        private String name;
        private double price;
        Item (String name, double price) {
            this.name = name;
            this.price = price;
        }
        public String getName () {
            return name;
        }
        public double getPrice () {
            return price;
        }
    }

    class FoodItem extends Item {
        private Date expires;

        FoodItem(String name, double price, Date expires) {
            super(name, price);
            this.expires = expires;
        }

        public Date getExpires() {
            return expires;
        }

        @Override
        public String toString() {
            return "FoodItem name='" + getName()
                    + "' price='" + getPrice()
                    + "' expires='" + getExpires() + "'";
        }

        public static void main(String[] args) {
            FoodItem[] items = new FoodItem[10];

            for (int i = 0; i < items.length; i++) {
                items[i] = new FoodItem("Item " + i, 12.3 * i,
                        new Date(i * 1000 * 60 * 60 * 24));
            }
            for (FoodItem item : items) {
                System.out.println(item);
            }
        }
    }

class NonFoodItem extends Item {
    private ArrayList <String> materials;

    NonFoodItem (String name, double price, ArrayList<String> matrials) {
        super (name, price);
        this.materials = materials;
    }
    NonFoodItem (String name, double price, String[] materials) {
        super(name, price);
        this.materials = new ArrayList<>(Arrays.asList(materials));
    }
    public ArrayList<String> getMaterials() {
        return materials;
    }

    @Override
    public String toString() {
        String m = "[";
        for (int i = 0 ; i < materials.size() ; i++) {
            m += (i==0 ? "" : ",") + materials.get(i);
        }
        m += "]";
        return "NonFoodItem name= '" + getName() + "'price='" + getPrice() + "'materials='" + m + "'";
    }

    public static void main(String[] args) {
        NonFoodItem[] items = new NonFoodItem[10];

        for (int i = 0 ; i < items.length ; i++) {
            items[i] = new NonFoodItem("Item " + i, 12.3 * 3, new String [] {"butter", "cream"});
        }
        for (NonFoodItem item: items) {
            System.out.println(item);
        }
    }
}

class Inventory {
    private ArrayList<Item> items;

    Inventory (ArrayList<Item>items) {
        this.items = items;
    }
    Inventory () {
        this(new ArrayList<Item>());
    }

    public void addItem (Item item) {
        if (!items.contains(item)) {
            items.add(item);
        }
    }

    public  void removeItem (Item item) {
        items.remove(item);
    }

    public double getInventory() {
        double total = 0.0;

        for (Item item: items) {
            total += item.getPrice();
        }
        return total;
    }

    public void printInventory () {
        System.out.println("Inventory:");

        for (Item item: items) {
            System.out.println(" - " + item);
        }
    }

    public static void printStatus (Inventory inventory){
        inventory.printInventory();
        System.out.println("Total: " + inventory.getInventory());
        System.out.println("");
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Item i1 = new Item ("Chips", 15.95);
        Item i2 = new Item("Juice", 19.95);
        Item i3 = new FoodItem("Meat", 39.95, new Date(12*1000*60*60*24));
        Item i4 = new NonFoodItem("Camera", 199.95, new String[] {"plastic", "glass"});

        Item[] items = new Item [] {i1, i2, i3, i4};

        printStatus(inventory);
        for (Item item: items) {
            inventory.addItem(item);
            printStatus(inventory);
        }

        inventory.removeItem(i1);
        printStatus(inventory);
    }
}
