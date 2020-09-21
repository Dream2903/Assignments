package com.company;

public class SevenPointFive {
    public static void main(String[] args) {

        //Declaring Array
        int[] intArray = new int[10];

        //"New array, with numbers: 1 on index 0, 2 on index 1 etc."
        int [] intArray2 = {1,2,3,4,};

        //Print array (use loop)
        for (int i = 0; i < intArray2.length; i++ )
        //intArray.length could be = 4 (the lenght of the array)
        //*Variable-name*.length makes it more dynamic
        {
            //Print array index'
            System.out.println(intArray2[i]);
        }
    }
}