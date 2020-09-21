package com.company;

public class ArrayLængdeAfEnMåned {
    public static void main(String[] args) {

        //Declare int array
        int [] months = {31, 28, 31, 30, 31,30, 31, 31, 30, 31, 30, 31} ;


        //Declare for loop with array
        for (int i = 0 ; i < months.length ; i++) {
            System.out.println(("Month " + (i+1) + " has " + months[i] + " days")) ;

        }
    }
}
