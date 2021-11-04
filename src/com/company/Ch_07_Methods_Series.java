package com.company;

public class Ch_07_Methods_Series {

    static int Fibonacci(int n)
    {
        if (n==0||n==1)
        {
            return n;
        }
        else
        {
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }

    static int factorial(int n) {
        //factorial(n)= n*n-1*n-2*n-3.....*1
        //factorial(5)=5*4*3*2*1=120
        //factorial(n)=n*factorial(n-1)
        //factorial(0)=factorial(1)=1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int Pell(int n){
        if (n==0||n==1||n==2)
        {
            return n;
        }
        else
        {
            return Pell(n-2)+(Pell(n-1)*2);
        }

    }

    static long Catalan(int n){
        if(n<=1)
        {
            return 1;
        }
        else
        {
            long catno=0;
            for (int i=0;i<n;i++)
            {
                catno=catno+(Catalan(i)*Catalan(n-i-1));
            }
            return catno;
        }

    }
    static int TriangularNumber(int n){

        if (n<=1) return 1;

        return n+TriangularNumber(n-1);

    }

    static int SqrNo(int n){
        if (n==1||n==0) return n;
        return ((2*(n-1)+1)+SqrNo(n-1));
    }

    static int cubeSeries(int n)
    {
        if (n==0||n==1) return n;
        return cubeSeries(n-1)+1+(3*(n-1)*(n-1))+(3*(n-1));
    }

    static float celToFar(float c)
    {
        return (c*1.8f)+32;
    }
    static float farToCel(float f)
    {
        return (f-32)/1.8f;
    }







    public static void main(String[] args) {

        int fact=factorial(7);
        System.out.println("The factorial is "+fact);

        int fibo=Fibonacci(12);
        System.out.println("The Fibonacci series value is "+fibo);

        int pell1=Pell(10);
        System.out.println("The Pell Series value is "+pell1);

        int buff;

        for(int i=0;i<=15;i++)

        {
            buff=cubeSeries(i);
            System.out.print(buff+" ");
        }

        long catbuff;
        catbuff= Catalan(5);
        System.out.println("\nCatalan: "+catbuff);

        for (int i=0;i<=15;i++)
        {
            catbuff=Catalan(i);
            System.out.print(catbuff+" ");
        }
        System.out.println();

        float ab=celToFar(25);
        System.out.println("The Celsius to fahrenheit "+ab);

        float ca=farToCel(77);
        System.out.println("The Fahrenheit to Celsius "+ca);







    }


}
