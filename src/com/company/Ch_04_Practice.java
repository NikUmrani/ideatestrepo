package com.company;

import java.util.Scanner;

public class Ch_04_Practice {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Subject 1 Marks out of 100: ");
        int sub1=sc.nextInt();
        System.out.println("Enter Subject 2 Marks out of 100: ");
        int sub2=sc.nextInt();
        System.out.println("Enter Subject 3 Marks out of 100: ");
        int sub3=sc.nextInt();

        float total= (sub1+sub2+sub3)/3.0f;


        if(sub1<=33)
        {
            System.out.println("The Result is Fail in Subject 1.");
        }
        else if (sub2<=33)
        {
            System.out.println("The Result is Fail in Subject 2.");

        }
        else if (sub3<=33)
        {
            System.out.println("The Result is Fail in Subject 3.");
        }
        else
        {
            System.out.println("Result is pass in all subjects.");
        }
        if (total<=40)
        {
            System.out.println("The Result is overall Fail.");
        }
        else
        {
            System.out.printf("The percentage is %f", total);
        }






    }
}
