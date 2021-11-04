package com.company;

public class Imp_Pattern {
    public static void main(String[] args) {

        //Pattern will be called in main method here.
        pattern1(5);

    }

    static void pattern1(int n){

        int rows;
        int col;
        for (rows=1;rows<=n;rows++) {//outer for loop is for rows
            for (col = 1; col <= n; col++) {
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
            for(col=1;col<=row;col++){

                System.out.print("* ");
            }
            System.out.println();
        }


    }

    static void pattern3(int n){
        int row;
        int col;

        for (row=1;row<=n;row++)
        {
            for (col=n;col>=row;col--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern4(int n){

        int row;
        int col;
        for (row=1;row<=n;row++)
        {
            for (col=1;col<=row;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }

    static void pattern5(int n){
        int row;
        int col;
        for (row=1;row<=(2*n)-1;row++)
        {
            if (row<=n)
            {
                for (col=1;col<=row;col++)
                {
                    System.out.print("* ");
                }
            }
            else
            {
                for (col=1;col<=(2*n)-row;col++)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void pattern6(int n){

        int row;
        int col;
        for(row=1;row<=n;row++)
        {
            for (col=1;col<=n-row;col++)//here spaces for loop is first.
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
            for (col=1;col<=row-1;col++)
            {
                System.out.print("  ");
            }
            for (col=n;col>=row;col--)
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
            for (col=1;col<=n-row;col++)
            {
                System.out.print("  ");
            }
            for (col=row;col>=1;col--)
            {
                System.out.print("* ");
            }
            for (col=2;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern9(int n){
        int row;
        int col;

        for (row=n;row<=1;row--)
        {
            for (col=row;col<=n;col++)
            {
                System.out.print("  ");
            }

            for (col=1;col<=(2*row)-1;col++)
            {
                System.out.print("* ");
            }
//
            System.out.println();

        }

    }


}
