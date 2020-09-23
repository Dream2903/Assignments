package com.company;

public class Juleudsalg {
    public static void main(String[] args) {

        // (1) Current time in seconds
        int x = 2592000;

        //Regular price
        double price = 599.95;

        //First to last december day (1-30)
        if (x <33695999 && x >31104000) {
            price = 599.95 * 0.7;           //Price on sale (30% off)
        }

        else
            price = 599.95;                 //Price if not on sale
        System.out.println(price);
    }
}
