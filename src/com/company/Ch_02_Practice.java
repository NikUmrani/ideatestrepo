package com.company;


import java.util.Scanner;

public class Ch_02_Practice {

    public static void main(String[] args) {

        //encrypt and decrypt data.

        char grade='B';
        grade=(char) (grade+8);
        System.out.println(grade);

        //Decrypt
        grade=(char) (grade-8);
        System.out.println(grade);


        //User i/p greater or smaller.

        System.out.println("Enter your number: ");
        Scanner sc=new Scanner(System.in);
        int ud=sc.nextInt();
        int cd=50;

        System.out.println(ud<cd);

    }
}
