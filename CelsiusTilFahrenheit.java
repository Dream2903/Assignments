package com.company;

public class CelsiusTilFahrenheit {
    public static void main(String[] args) {

        //F = 1.8 * C + 32

        // For loop. Min = -5, max = 40. Add one for each loop.
        for ( int x = -5; x <= 40; x++) {
            System.out.println(x + "C" + " = " + (1.8 * x + 32) + "F");

            if ( x != 40) {
                System.out.println((x + 0.5) + "C" + " = " + (1.8 * (x + 0.5) + 32) + "F");
            }
        }


    }
}
