package com.company;

import java.util.Scanner;

public class Ch_04_Practice_Website {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Website's full address: ");
        String web=sc.nextLine();


        if (web.startsWith("www.")) {

            if (web.endsWith(".com")) {
                System.out.println("It is a commercial website.");

            } else if (web.endsWith(".org")) {
                System.out.println("It is a organizational website.");
            } else if (web.endsWith(".in")) {
                System.out.println("It is a Indian Website.");
            } else {
                System.out.println("Invalid Input.");
            }
        }
        else
        {
            System.out.println("Invalid Input.");
        }
    }
}
