package com.company;

import java.util.Scanner;

public class Exercise_01 {

    public static void main(String[] args) {

        System.out.println("Welcome to the Marks Calculator:");
        System.out.println("Please Specify Marks and Total Marks.");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Sub1 Marks:");
        float sub1=sc.nextInt();
        System.out.println("Enter Total Marks of Sub1:");
        float tot_sub1=sc.nextInt();

        System.out.println("Enter Sub2 Marks:");
        float sub2=sc.nextInt();
        System.out.println("Enter Total Marks of Sub2:");
        float tot_sub2=sc.nextInt();

        System.out.println("Enter Sub3 Marks:");
        float sub3=sc.nextInt();
        System.out.println("Enter Total Marks of Sub3:");
        float tot_sub3=sc.nextInt();

        System.out.println("Enter Sub4 Marks:");
        float sub4=sc.nextInt();
        System.out.println("Enter Total Marks of Sub4:");
        float tot_sub4=sc.nextInt();

        System.out.println("Enter Sub5 Marks:");
        float sub5=sc.nextInt();
        System.out.println("Enter Total Marks of Sub5:");
        float tot_sub5=sc.nextInt();

        float gr_tot_sub_marks= sub1+sub2+sub3+sub4+sub5;
        float gr_tot_marks=tot_sub1+tot_sub2+tot_sub3+tot_sub4+tot_sub5;

        float per_marks=gr_tot_sub_marks/gr_tot_marks*100;

        System.out.println("The total marks obtained is: "+gr_tot_sub_marks);
        System.out.println("Percentage is: "+per_marks);




    }
}
