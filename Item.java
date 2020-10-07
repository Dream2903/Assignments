import java.util.Date;

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
    public double price() {
        return price;
    }
}

//Subclass of Item
class FoodItem extends Item {

    //Variable
    Date expires;

    //Method
    FoodItem (String name, double price, Date expires) {
        super(name, price);
        this.expires = expires;
    }
    public Date getExpires () {
        return expires;
    }
    @Override
    public String toString () {
        return name + " " + price + " " + expires;
    }

    public static void main(String[] args) {
        FoodItem [] items = new FoodItem[10];

        for (int i = 0 ; i < items.length ; i++) {
            items[i] = new FoodItem("", );
        }
    }
}

//Subclass of Item
class NonFoodItem extends Item {

    //Variable
    String [] materials;

    //Method
    NonFoodItem (String name, double price, String [] materials) {
        super(name, price);
        this.materials = materials;
    }
    public String [] getMaterials() {
        return materials;
    }
    @Override
    public String toString () {
        return name + " " + price + " " + materials;
    }
}

class MainTwo {

        public static void main(String[] args) {
            FoodItem [] items = new FoodItem[10];

            for (int i = 0 ; i < items.length ; i++) {
                items[i] = new FoodItem("Chicken", 5.0, );
            }
        }
    }

