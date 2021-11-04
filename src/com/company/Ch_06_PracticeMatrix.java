package com.company;

public class Ch_06_PracticeMatrix {
    public static void main(String[] args) {
        int a [][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum[][]=new int[3][3];

        for (int i=0;i<a.length;i++)
        {

            for (int j=0;j<a.length;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
                System.out.print(sum[i][j]+" ");

            }
            System.out.println();
        }
        //Problem 5 Reverse Array

        int [] arr={54,87,23,14,69};
        int l=arr.length;
        int n=Math.floorDiv(l,2);
        int temp;

        for (int i=0;i<n;i++)
        {
            temp=arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }
        for (int e:arr)
        {
            System.out.print(e +" ");
        }

        //Problem 6
        int []a1={-58,54,69,3254,324,-8746,15};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for (int e:a1)
        {
            if(e>max)
            {
                max=e;
            }
            else if (e<min)
            {
                min=e;
            }
        }
        System.out.printf("The %d is the maximum value and %d is minimum value.",max,min);




    }
}
