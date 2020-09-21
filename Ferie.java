package com.company;

public class Ferie {
    public static void main(String[] args) {

        //Declare variable
        int month = 10;

        //Vacation months
        if (month == 10) {
            System.out.println("Efterårsferie");
        }
        if (month == 12) {
            System.out.println("Juleferie");
        }
        if (month == 4) {
            System.out.println("Påskeferie");
        }
        if (month == 7 || month == 8) {
            System.out.println("Sommerferie");
        }
        //No vacation months
        else if (month != 10 && month != 12 && month != 4 && month != 7 && month != 8)
            System.out.println("Hårdt arbejde");
    }
}

// Use a switch (?)