package com.company;

public class Sum {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;

        int sumNum1Num2 = add (num1, num2);

        System.out.println(sumNum1Num2);

    }
    public static int add (int a, int b) {

        int result = a + b;
        return result;
    }
}

