package com.company;

public class Imp_Practice_Pattern_Easy {

    public static void main(String[] args) {

        pattern777(5);

    }

    static void pattern1(int n)
    {
        int row;
        int col;
        for (row=1;row<=n;row++)
        {
            for (col=1;col<=n;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    static void pattern2(int n){

        int row;
        int col;

        for (row=1;row<=n;row++)
        {
            for (col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern3(int n)
    {
        int row;
        int col;

        for (row=1;row<=n;row++)
        {
            for (col=row;col<=n;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


    }

    static void pattern6(int n){
        int row;
        int col;

        for (row=1;row<=n;row++)
        {
            for (col=row;col<=n;col++)
            {
                System.out.print("  ");
            }
            for (col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern7(int n){

        int row;
        int col;
        for (row=1;row<=n;row++)
        {
            for (col=1;col<=row;col++)
            {
                System.out.print("  ");
            }
            for (col=row;col<=n;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        int row;
        int col;

        for (row=1;row<=n;row++)
        {
            for (col=row;col<=n;col++)
            {
                System.out.print("  ");
            }
            for (col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            for (col=1;col<row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n){
        int row;
        int col;
        for (row=1;row<=n;row++)
        {
            for (col=1;col<=row;col++)
            {
                System.out.print("  ");
            }
            for (col=row;col<=n;col++)
            {
                System.out.print("* ");
            }
            for (col=row;col<n;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (row=1;row<=n;row++)
        {
            for (col=row;col<=n;col++)
            {
                System.out.print("  ");
            }
            for (col=1;col<row;col++)
            {
                System.out.print("* ");
            }
            for (col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern5(int n){
        int row;
        int col;

        for (row=1;row<=n;row++)
        {
            for (col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (row=1;row<=n;row++)
        {
            for (col=row;col<n;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    static void pattern9(int n){
        int row;
        int col;
        for (row=1;row<=n;row++)
        {
            for (col=1;col<=row;col++)
            {
                System.out.print("  ");
            }
            for (col=row;col<=n;col++)
            {
                System.out.print("* ");
            }
            for (col=row;col<n;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern777(int n){
        int row;
        int col;

        for (row=1;row<=n;row++)
        {

            for (col=1;col<=row;col++)
            {
                if (row==col||(row%2==0&&col%2==0)||(row%2==1&&col%2==1))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


}
