package com.company;

class Parent{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void meth1(){
        System.out.println("This is Parent class Method 1.");
    }
    public void meth2(){
        System.out.println("This is Parent class Method 2");
    }
}
class Child1 extends Parent{

    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void meth2(){
        System.out.println("This is Child class Method 2");
    }
    public void  meth3(){
        System.out.println("This is Child class Method 3");
    }
}

public class Ch_10_Method_Overriding {
    public static void main(String[] args) {

        Parent pq=new Parent();
        //pq.meth1();
        //pq.meth2();

        Child1 ch=new Child1();
        //ch.meth1();
        //ch.meth2();
        //ch.meth3();

        Parent tw=new Child1();//Dynamic Method Dispatch.Reference SuperClass but Object SubClass.
        tw.meth1();//The methods common to both Classes and Methods of Parent Class are available only.
        tw.meth2();//With common methods overriding of Child Class.
        //tw.meth3();



    }
}
