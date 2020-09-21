package com.company;

public class ArealAfCirkler {
    public static void main(String[] args) {

        for ( int radius = 1; radius <= 5; radius += 2) {
            System.out.println(" Area of a circle with a radius of " + radius + " is: " + Math.PI * (radius * radius ));

        }
    }
}
