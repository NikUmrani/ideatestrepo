package com.company;

interface Something{
    private void saySomething(){
        System.out.println("I am something.");
    }
    default void say(){
        saySomething();
    }
    void Swe();
}

public class Ch_11_Private_Method_Interface implements Something{
    public void Swe(){
        System.out.println("This is Sweden.");
    }
    //this is compulsory declared as it is abstract method in interface.
    public static void main(String[] args) {


        Something sm=new Ch_11_Private_Method_Interface();
        sm.say();

    }
}
