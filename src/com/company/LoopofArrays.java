package com.company;

public class LoopofArrays {

    public static void main(String[] args)
    {

    int sum = 0;


        int[] grades = new int[5];
        grades[0] = 88;
        grades[1] = 90;
        grades[2] = 95;
        grades[3] = 99;
        grades[4] = 100;


        System.out.println("The arrays are the following: ");
    for (int i =0; i<=4; i++) {
        sum = grades[i];

        System.out.println(sum);}



    }
}
