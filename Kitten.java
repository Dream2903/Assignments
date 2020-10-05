public class Kitten {

    //Attributes
    double cuteness;
    static int count = 0;

    //Constructor
    public Kitten (double cuteness) {
        this.cuteness = cuteness;

        count++;    //counts the amount of kittens made
        }

    public static void main(String[] args) {

        //for loop that creates kitties
        for (int i = 0 ; i < 10; i++) {

            double cute = Math.random() * 100;

            new Kitten(cute);  //Assigns "cute" a random number between 0-100

            //print without decimals
            System.out.printf("A kitten with %.2f cuteness was born! %n", cute);
        }
        System.out.println();   //Creates empty line (to make space between the prints)
        System.out.println(count + " kittens were born!");

    }
}


