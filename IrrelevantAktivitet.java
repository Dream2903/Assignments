package com.company;

public class IrrelevantAktivitet {

    public static void main(String[] args) {

        int a = 0;
        int b = 4;

        System.out.println(fun(1, b));
        System.out.println(fun(2, b));
        System.out.println(fun(3, b));
    }

    public static int fun (int a, int b) {

            int result = a * b;
            return result;
        }
    }
