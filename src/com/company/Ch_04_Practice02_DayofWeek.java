package com.company;

import java.util.Scanner;

public class Ch_04_Practice02_DayofWeek {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number:- ");
        int dayno=sc.nextInt();

        switch (dayno)
        {
            case 1:
                System.out.println("Your Day is Monday.");
                break;

            case 2:
                System.out.println("Your day is Tuesday.");
                break;
            case 3:
                System.out.println("Your day is Wednesday.");
                break;
            case 4:
                System.out.println("Your day is Thursday.");
                break;
            case 5:
                System.out.println("Your day is Friday.");
                break;
            case 6:
                System.out.println("Your day is Saturday.");
                break;
            case 7:
                System.out.println("Your day is Sunday.");
            default:
                System.out.println("Invalid Input.");

        }
    }
}
