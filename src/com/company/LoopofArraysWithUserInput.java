package com.company;

import java.util.Scanner;

public class LoopofArraysWithUserInput {

    public static void main(String[] args)
    {

        System.out.println("Please enter how many integers you would like to enter: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

    int sum = 0;

        int[] grades = new int[5];
        grades[0] = 88;
        grades[1] = 90;
        grades[2] = 95;
        grades[3] = 99;
        grades[4] = 100;


        System.out.println("The arrays are the following: ");
    for (int i =0; i<n; i++){
        sum = grades[i];

        System.out.println(sum);}

    }
}
