public class CustomerDatabase {

    //Attribute
    Customer [] customers;

    //Constructor - Sørger kun for at arrayet for en længde på 10
    public CustomerDatabase () {
        customers = new Customer [10];

    }

    //Metode -  Tilføjer ting til arrayet, ved at sende et objekt ned
    void add (Customer customer) {
        customers [customer.id] = customer;
    }

    void remove (int id) {
        customers [id] = null;

    }

    //En metode der returnerer (indholde af) "customer"
    Customer get(int id) {
        return customers [id];
    }

    void print () {
        for (Customer c : customers) {
            if (c == null) {
                continue;
            }
            System.out.println(c.name);
        }
    }
}
