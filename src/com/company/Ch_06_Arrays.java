package com.company;

public class Ch_06_Arrays {
    public static void main(String[] args) {

        int [] marks=new int[10];
        marks[0]=100;
        marks[1]=58;
        marks[2]=75;
        marks[3]=47;
        marks[4]=51;
        marks[5]=28;
        marks[6]=45;
        System.out.println(marks[5]);

        int [] xyz;
        xyz=new int[10];
        System.out.println(xyz[7]);

        int [] tmz={100,52,48,45,56,87};
        System.out.println(tmz[3]);
        System.out.println(marks.length);

        float [] flt={15.25f,47.69f,58.69f,41.32f,12.98f};
        String [] str={"Nikhil","Rakesh","Saina","Pooja"};

        for (int i=0;i<str.length;i++)
        {
            System.out.println(str[i]);
        }

        for (int j=str.length-1;j>=0;j--)
        {
            System.out.println(str[j]);
        }


        //For Each loop

        for (int nik:marks)//Index not available
        {
            System.out.println(nik);
        }

        //Multi-Dimensional Arrays

        int [][] nom=new int[2][3];

        nom[0][0]=144;
        nom[0][1]=204;
        nom[0][2]=543;
        nom[1][0]=424;
        nom[1][1]=740;
        nom[1][2]=961;

        //3D array

        String [][][] arg=new String[5][4][7];
        System.out.println(arg.length);

    }
}
