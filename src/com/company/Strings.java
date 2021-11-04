package com.company;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        String a1="Nikhil";
        String a2= new String("Umrani");

        System.out.println(a1+a2);
        System.out.print("The name is: ");
        System.out.print(a1);

        int a=9;
        float b=2.6554f;
        System.out.printf("The value of a is %d and value of b is %f",a,b);
        //d=int, f=float, c=char, s=string.
        Scanner sc=new Scanner(System.in);
        //String s1=sc.next();
        //System.out.println(s1);
        String s2= sc.nextLine();
        System.out.println(s2);





    }
}
