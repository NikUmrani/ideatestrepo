package com.company;

import java.util.Scanner;

public class Ch_05_Practice_SumOfMultiplicationTable {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your No.");
        int no=sc.nextInt();
        int sum=0;
        for (int i=1;i<=10;i++)
        {
            sum=sum+no*i;
        }
        System.out.println("The Sum of The Multiplication Table is:- "+sum);
    }
}
