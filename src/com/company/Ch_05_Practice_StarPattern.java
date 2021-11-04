package com.company;

public class Ch_05_Practice_StarPattern {
    public static void main(String[] args) {

//        for (int i=4;i>0;i--)
//        {
//            for (int j=1;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println("\n");
//        }


        int x=4;

        while (x>0)
        {
            int y=1;
            while (y<=x)
            {
                System.out.print("*");
                y++;
            }

            System.out.println("\n");
            x--;
        }

    }
}
