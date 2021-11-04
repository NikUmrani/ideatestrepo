package com.company;

class  Thr extends Thread{
    public Thr(String name){
        super(name);
    }
    public void run(){
        int n=200000;
        while (n<=1000) {
            System.out.println("I am Thread 1.");
            System.out.println("Nikhil");
            n++;
        }
    }
}

public class Ch_13_Threads_Constructors {
    public static void main(String[] args) {
        Thr t22= new Thr("First Thread");
        Thr t33 = new Thr("Second Thread");
        t22.start();
        System.out.println("The name of Thread is "+t22.getName());
        System.out.println("The ID of Thread is "+t22.getId());
        System.out.println("The Priority of Thread is "+t22.getPriority());
        System.out.println("The name of Thread is "+t33.getName());
        System.out.println("The ID of Thread is "+t33.getId());
        System.out.println("The Priority of Thread is "+t33.getPriority());

    }
}
