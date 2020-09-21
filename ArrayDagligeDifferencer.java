package com.company;

public class ArrayDagligeDifferencer {
    public static void main(String[] args) {

        //Tempeatures of the weeek days. Monday - Sunday
        double a[] = {21.5, 23.7, 19.6, 22.5, 25.3, 21.7, 18.9};

        //Tempeatures of the weeek days. Sunday - Monday.
        double b[] = {18.9, 21.5, 23.7, 19.6, 22.5, 25.3, 21.7};

        //Subtract array b from array a
        double [] c = new double[a.length];

        for (int i = 0; i < a.length; i++) {

            c[i] = a[i] - b[i];

            //Prints sundag - monday --> tuesday - monday --> wednesday - tuesday etc.
            System.out.println("Temperature: " + c[i]);
        }

    }
}


