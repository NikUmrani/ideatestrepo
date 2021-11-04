package com.company;

import java.util.Scanner;

public class Ch_04_Practice_LeapYear {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Year:- ");
        int year=sc.nextInt();

        if(year%4==0)
        {
            System.out.printf("The Year %d you entered is a Leap Year.",year);

        }
        else
        {
            System.out.printf("The Yead %d you entered is NOT a Leap Year.",year);
        }
    }
}
