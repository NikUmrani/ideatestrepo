package com.company;

import java.util.Scanner;

public class Ch_04_SumofEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of evens you want:");
        int no = sc.nextInt();

//        for (int i = 0; i <= no; i++)
//        {
//            if ((i%2)==0)
//            {
//                System.out.println(i);
//            }
//        }

        int i=0;
        int sum=0;
        while (i<=no)
        {
            if (i%2==0)
            {
                System.out.println(i);
                sum=sum+i;
            }
           i++;
        }
        System.out.println("Sum of all Nos is:"+sum);

        int sum1=0;
        for (int x=0;x<=no;x++)
        {
            if (x%2==0)
            {
                System.out.println(x);
                sum1=sum1+x;
            }
        }
        System.out.println(sum1);
    }
}
