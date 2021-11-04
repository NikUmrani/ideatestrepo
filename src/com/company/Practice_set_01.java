package com.company;

import java.util.Scanner;

public class Practice_set_01 {

    public static void main(String[] args) {


        int a= 50;
        int b=60;
        int sum=a+b;
        System.out.println(sum);

        float mark1=45;
        float mark2=54;
        float mark3=65;
        float cgpa=(mark1+mark2+mark3)/30;
        System.out.println(cgpa);

        System.out.println("What is your name?");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("Hello "+name+" have a good day");

        //System.out.println("Enter your no.:");
        //System.out.println(sc.hasNextInt());

        System.out.println("Enter kms to convert into miles:");
        float km_to_mil=sc.nextFloat();

        double ans_mil=km_to_mil*0.621371;

        System.out.println("Miles:"+ans_mil);

        System.out.println("Enter miles to convert kms:");
        float mil=sc.nextFloat();

        double ans_km=mil*1.60934;
        System.out.println("KMs:"+ans_km);








    }
}
