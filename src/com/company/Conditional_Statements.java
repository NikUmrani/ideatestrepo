package com.company;

public class Conditional_Statements {

    public static void main(String[] args){

        int age=15;

        if(age>=18)
        {
            System.out.println("Eligible for vote");

        }
         else
        {
            System.out.println("Not Eligible for vote");

        }

         int day=5;

         if(day==1)
         {
             System.out.println("SUNDAY");
         }
         else if (day==2)
         {
             System.out.println("MONDAY");
         }
         else if (day==3)
         {
             System.out.println("TUESDAY");
         }
         else if (day==4)
         {
             System.out.println("WEDNESDAY");

         }
         else if (day==5)
         {
             System.out.println("THURSDAY");

         }
         else if (day==6)
         {
             System.out.println("FRIDAY");

         }
         else if (day==7)
         {
             System.out.println("SATURDAY");
         }
         else
         {
             System.out.println("NOT VALID INPUT");
         }

         int month=5;

         switch (month)
         {
             case 1:
                 System.out.println("Jan");
                 break;
             case 2:
                 System.out.println("Feb");
                 break;
             case 3:
                 System.out.println("March");
                 break;
             case 4:
                 System.out.println("April");
                 break;
             case 5:
                 System.out.println("May");
                 break;
             case 6:
                 System.out.println("June");
                 break;
             case 7:
                 System.out.println("July");
                 break;
             case 8:
                 System.out.println("Aug");
                 break;
             case 9:
                 System.out.println("Supt");
                 break;
             case 10:
                 System.out.println("Oct");
                 break;
             case 11:
                 System.out.println("Nov");
                 break;
             case 12:
                 System.out.println("Dec");
                 break;
             default:
                 System.out.println("Invalid Input");
         }

    }

}
