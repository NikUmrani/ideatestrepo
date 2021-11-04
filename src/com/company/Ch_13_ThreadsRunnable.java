package com.company;


class MyThread1 implements Runnable{
    public void run(){
        int n=0;
        while (n<=1000) {
            System.out.println("I am Thread 1.");
            System.out.println("Nikhil");
            n++;
        }
    }
}
class MyThread2 implements Runnable{
    public void run(){
        int n=0;
        while (n<=1000) {
            System.out.println("I am Thread 2.");
            System.out.println("Umrani");
            n++;
        }
    }
}
public class Ch_13_ThreadsRunnable {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        Thread tm1=new Thread(t1);

        MyThread2 t2=new MyThread2();
        Thread tm2= new Thread(t2);

        tm1.start();
        tm2.start();
    }
}
