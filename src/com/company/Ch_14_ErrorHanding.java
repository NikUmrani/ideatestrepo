package com.company;

public class Ch_14_ErrorHanding {
    public static void main(String[] args) {
        int a=50;
        int b=0;
         int c;

         try{
             c=a/b;
             System.out.println(c);
         }
         catch (Exception e){
             System.out.println(e);
         }
        System.out.println("End of Program");

    }
}
