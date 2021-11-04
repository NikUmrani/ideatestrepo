package com.company;

class Thread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<=1000){
          System.out.println("My Thread1 is running.");
          System.out.println("I am Happy");
          i++;
      }
    }
}

class Thread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<=1000){
            System.out.println("My Thread2 is running.");
            System.out.println("I am Sad");
            i++;
        }
    }


}


public class Ch_13_Threads {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        t2.start();

    }
}
