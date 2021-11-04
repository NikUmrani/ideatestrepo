package com.company;

public class Ch_05_Loops {
    public static void main(String[] args) {

        int i=110;
        while (i<=10)
        {
            System.out.println(i);
            i++;
        }
        i=110;

        do {
            System.out.println(i);
            i++;
        } while (i<=10);

        for (int j=0;j<=10;j++)
        {
            System.out.println(j);
        }

        for (int k=10;k>=0;k--)
        {
            System.out.println(k);
        }

        System.out.println("\nThis is break and continue.");

        int s=0;

        while (s<=5)
        {
            System.out.println("This is in loop.");
            if (s==3)
            {
                System.out.println("This is break loop.");
                break;
            }
            System.out.println("Outside loop.");
        s++;
        }

        System.out.println("\n\n\n");
        s=0;
        while (s<=5)
        {
            s++;
            System.out.println("This in next loop.");

            if (s==3)
            {
                System.out.println("This is in continue loop.");
                continue;

            }
            System.out.println("Outside Loop.");

        }


    }
}
