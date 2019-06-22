package com.company;

public class Arrays {

    public static void main(String[] args)
    {

        int[] grades = new int[5];
        grades[0] = 88;
        grades[1] = 90;
        grades[2] = 95;
        grades[3] = 99;
        grades[4] = 100;

    System.out.println("Grade 1 is: " + grades[0]);
    System.out.println("Grade 2 is: " + grades[1]);
    System.out.println("Grade 3 is: " + grades[2]);
    System.out.println("Grade 4 is: " + grades[3]);
    System.out.println("Grade 5 is: " + grades[4]);

    int Average = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4])/5;

        System.out.println("The Average is : " + Average);

    }
}
