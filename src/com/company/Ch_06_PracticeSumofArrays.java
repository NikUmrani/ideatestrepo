package com.company;

import java.util.Scanner;

public class Ch_06_PracticeSumofArrays {
    public static void main(String[] args) {

        //Problem no. 1:
        float [] arry=new float[5];
        arry[0]=25.65f;
        arry[1]=63.84f;
        arry[2]=58.36f;
        arry[3]=74.35f;
        arry[4]=51.69f;

        float sum=0;

        for (int i=0;i<arry.length;i++)

        {
            sum=sum+arry[i];
        }
        System.out.println("The sum of all the elements is: "+sum);

        //Problem no.2

        int []ar1={25,54,87,56,12,36,23,96,84,53};

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. you want to Find.");
        int no=sc.nextInt();
        boolean isArray=false;

        for (int i : ar1) {
            if (no == i) {
                isArray = true;
                break;
            }

        }
        if(isArray)
        {
            System.out.println("The value is present in the array.");
        }
        else
        {
            System.out.println("The value is not present in the array.");
        }

        //Problem No. 3

        float [] marks={57f,65f,84f,68f,74f,40f,25f,87f,95f,63f};

        float sum1=0;
        for (float i:marks)
        {
            sum1=sum1+i;

        }
        float avg=sum/marks.length;
        System.out.printf("The average Marks in Physics is: %.2f",avg);














    }
}
