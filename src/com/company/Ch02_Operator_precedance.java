package com.company;

public class Ch02_Operator_precedance {

    public static void main(String[] args) {

        //int a=6*5+5-7/2;//30+5-3=35-3=32

        int x=2,y=5;
        int k= (x-y)/2;

        int b=4,a=2,c=5;

        int q= (b*b-4*a*c)/2*a;

        int w=(b*b)-(c*c);
        char ch='a';
        ch++;
        System.out.println(ch);

        System.out.println(q);
        float f=7/4*9/2;//Ans will be cal in integer.
        System.out.println(f);
        f=7/4.0f*9/2.0f;//Ans now will be cal correctly
        System.out.println(f);

    }
}
