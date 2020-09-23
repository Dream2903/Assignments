package com.company;

public class Kalender {
    public static void main(String[] args) {

        //Regular year - days per month.
        int [] monthsNotLeapYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;

        //Leap year - days per month.
        int [] monthsLeapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;

        // declaring int array outside the for loop
        int[] years;

        //Leap year in 2000 and every 4 years after - 2004, 2008 etc.
        for (int i = 2000 ; i < 2021 ; i++) {
             years = (i % 4 == 0 ? monthsLeapYear : monthsNotLeapYear);

            for (int x = 0; x < years.length; x++) {
                System.out.print(" "+ years[x]);
            }
            System.out.println();
        }
    }
}
