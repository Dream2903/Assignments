package com.company;

public class Fakultet {
    public static void main(String[] args) {

        //Number to factorial
        int factorialNumber = 5;

        //Prints the calculation
        System.out.println("Factorial of " + factorialNumber + " is " +faculty(factorialNumber));


    }
    //Method
    public static int faculty (int num) {
       if (num == 0)
           return 1;        //!0 = 1
       else
           return (num * faculty(num-1));
    }
}

