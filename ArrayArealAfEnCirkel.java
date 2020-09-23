package com.company;

public class ArrayArealAfEnCirkel {
    public static void main(String[] args) {

        //Declare Array
        int [] arrayRadius = {1, 3, 5};

        //Declare areas
        for (int i = 0 ; i <arrayRadius.length ; i++) {

            double areal = arrayRadius[i]* arrayRadius[i] * Math.PI;

            System.out.println("The area of a circle with a radius of " + arrayRadius[i] + " is: " + areal);

        }
        }

    }
