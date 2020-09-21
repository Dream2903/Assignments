package com.company;

public class CirklerITal {
    public static void main(String[] args) {

        //Printing area
        //To call the method, write: method name (area) and the value.
        System.out.println("Area of a circle with radius 1 is: " + area(1));    // Write (area(1) --> (area(radius 1)
        System.out.println("Area of a circle with radius 3 is: " + area(3)) ;   // Write (area(3) --> (area(radius 3)
        System.out.println("Area of a circle with radius 5 is: " + area(5));    // Write (area(5) --> (area(radius 5)

        //Printing circumference
        System.out.println("Circumfernece of a circle with radius 1 is:" + circumference(1));
        System.out.println("Circumfernece of a circle with radius 3 is:" + circumference(3));
        System.out.println("Circumfernece of a circle with radius 5 is:" + circumference(5));



        }
        //Method for area
        public static double area (double radius) {

        double result = radius * radius * Math.PI;
        return result;
    }
    //Method for circumference
    public static double circumference (double radius) {
        double result = radius * radius * 2 * Math.PI;
        return result;
    }
}

