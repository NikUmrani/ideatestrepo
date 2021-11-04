package com.company;


public class Ch_07_Practice_Methods {

    static void multiplication(int n)
    {
        for (int i=1;i<=10;i++)
        {
            System.out.printf("%d X %d = %d\n",n,i,n*i);

        }
    }


    public static void main(String[] args) {

        multiplication(10);


    }
}
