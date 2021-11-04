package com.company;

class Base{
    int x;
    int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public int Multiply(){
        return x*y;
    }
    public void display(){
        System.out.println("This is class Base ");
    }

}
class Derive extends Base{

    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void display1(){
        System.out.println("This is class Derive.");
    }

    public int Multiply1(){
        return a*x*y;
    }


}

public class Ch_10_Inheritance {
    public static void main(String[] args) {
        Base nik=new Base();
        nik.display();

        Derive san=new Derive();
        san.display();
        san.display1();
        nik.setX(5);
        nik.setY(15);
        System.out.println(nik.Multiply());
        san.setA(4);
        System.out.println(san.Multiply1());
        //nik.setA();


    }
}
