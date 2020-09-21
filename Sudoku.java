package com.company;

public class Sudoku {
    public static void main(String[] args) {

        //declare multi-dimensional array               En nemmere måde at angive tabellen?
        int [] [] as = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9} ,
                {2, 3, 4, 5, 6, 7, 8, 9, 1} ,
                {3, 4, 5, 6, 7, 8, 9, 1, 2} ,
                {4, 5, 6, 7, 8, 9, 1, 2, 3} ,
                {5, 6, 7, 8, 9, 1, 2, 3, 4} ,
                {6, 7, 8, 9, 1, 2, 3, 4, 5} ,
                {7, 8, 9, 1, 2, 3, 4, 5, 6} ,
                {8, 9, 1, 2, 3, 4, 5, 6, 7} ,
                {9, 1, 2, 3, 4, 5, 6, 7, 8}
        } ;
        for (int i = 0; i < as[0].length; i++) {    // <-- Tyv stjålet. Hvorfor bruge dette/hvordan virker det?
         //Hvordan printer jeg hele pladen?
        }
    }
}
