package com.company;

import java.util.Scanner;

class MyBank{

    int accNo;
    String cusName;
    float amount;

    public void setAccNo(int ac){
        accNo=ac;

    }
    public void setCusName(String name){
        cusName=name;
    }
    public void accountCredit(float newAmount){
        amount=newAmount+amount;
    }
    public void accountDebit(float newAmount1){
        if (newAmount1>amount){
            System.out.println("Insufficient Account Balance.");

        }
        else
        {
            amount=amount-newAmount1;
        }
    }

    public void accountBalance(){

        System.out.println("Your Account Balance is "+amount);
    }



}



public class Ch_09_Banking {
    public static void main(String[] args) {

        MyBank nik1=new MyBank();
        nik1.setAccNo(8745221);
        nik1.setCusName("Nikhil Umrani");
        nik1.amount=5000f;

        nik1.accountCredit(10257.54f);
        nik1.accountBalance();

        nik1.accountDebit(6000.23f);
        nik1.accountBalance();

        System.out.println(nik1.accNo+"  "+nik1.cusName+"  "+nik1.amount);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Account Number: ");
        int num=sc.nextInt();

        if(num== nik1.accNo)
        {
            nik1.accountBalance();
        }
        else
        {
            System.out.println("Incorrect Account Number.");
        }


    }
}
