public class Customer {

    //Attributes
    String name;
    int id;
    double balance;


    //Constructor 1
    public Customer(String newname, int id2) {

        name = newname;
        id = id2;
        balance = 0;
    }

    //Constructor 2
    public Customer(String newnametwo, int id2, double newbalance) {

        name = newnametwo;
        id = id2;
        balance =  newbalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("You have deposited: " + amount);
            System.out.println("Your new balance is: " + balance);
        } else {
            System.out.println("Can't deposit a negative value.");
        }
    }
    public void withdraw (double amount){
            if (balance > amount)
                balance -= amount;
        }
    public static double getBalance(double balance) {
        return balance;
    }
    public static void main(String[] args) {
        Customer aCustomer = new Customer("Nicolaj", 2903, 0);
        System.out.println();

        //deposit
        aCustomer.deposit(1000);
        System.out.println();

        //withdraw
        aCustomer.withdraw(500);
    }
}