package com.company;

import java.util.Scanner;

public class Ch_04_Practice01_IncomeTax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Income here: ");
        float income=sc.nextFloat();
        float tax=0;
        if (income>=250000 && income<500000)
        {
            tax= income*0.05f;
            System.out.printf("The Income Tax is %.2f rupees",tax);
        }
        else if(income>=500000 && income<1000000)
        {
            tax=income*0.10f;
            System.out.printf("The Income Tax is %.2f rupees",tax);

        }
        else if(income>=1000000)
        {
            tax=income*0.2f;
            System.out.printf("The Income Tax is %.2f rupees",tax);
        }
        else
        {
            System.out.println("The Income tax is not applicable to you");
        }

    }
}
