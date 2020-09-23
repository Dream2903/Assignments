package com.company;

public class Primtal {
    public static void main(String[] args) {

        //Variable
        int last = 1000000;
        int max = -1;

        for (int i = 2; i < last; i++) {
            boolean isPrime = true;

            //Even numbers over 2 are not prime
            if (i > 2 && (i & 1) == 0) isPrime = false;

            //Prime numbers have a remainder when devided by a lower odd number
            for (int j = 3; j < i; j++) {
                if ( i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
                max = i;
            }
        }
        System.out.println("Highest prime is " + max); 
    }
}
