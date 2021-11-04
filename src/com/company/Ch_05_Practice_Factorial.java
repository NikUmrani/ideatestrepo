package com.company;

import java.util.Scanner;

public class Ch_05_Practice_Factorial {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no to find Factorial: ");
        int no=sc.nextInt();
        int sum1=1;
        for (int i=1;i<=no;i++)
        {

            sum1*=i;


        }
        System.out.println("The Factorial is :"+sum1);


        int j=1;
        sum1=1;
        while (j<=no)
        {
            sum1*=j;
            j++;
        }
        System.out.println(sum1);
    }
}
