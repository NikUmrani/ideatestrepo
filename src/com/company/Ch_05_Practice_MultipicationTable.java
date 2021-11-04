package com.company;

import java.util.Scanner;

public class Ch_05_Practice_MultipicationTable {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of which Multiplication Table is needed:");
        int no=sc.nextInt();
        System.out.println("The Multiplication table is: ");

        for (int i=1;i<=10;i++)
        {
            System.out.printf("%d X %d X %d",no,i,no*i);
            System.out.println("\n");

        }

        //Reverse Order
        System.out.println("The Reverse Order Multiplication Table is: ");
        for (int j=10;j>=1;j--)
        {
            System.out.printf("%d X %d X %d",no,j,no*j);
            System.out.println("\n");
        }


    }
}
