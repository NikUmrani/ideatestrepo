package com.company;

interface Bicycle{
    int a=50;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface Tyres{
    void ceatTyres();
    void mrfTyres();
    default void refTyres(){
        System.out.println("This is Ref Tyres");
    }
    private void dotTyres(){
        System.out.println("This is DOT Tyres");
    }
}

class AvonCycle implements Bicycle{
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Speeding Up");
    }
    void blowHorn(){
        System.out.println("Whistling");
    }
}

class RajCycles implements Bicycle,Tyres{
    public void applyBrake(int decrement){
        System.out.println("This is Raj Cycles Brake of "+decrement);
    }
    public void speedUp(int increment){
        System.out.println("This is Raj Cycles Speeding Up in "+increment);
    }
    public void ceatTyres(){
        System.out.println("Front Tyre is CEAT Tyres.");
    }
    public void mrfTyres(){
        System.out.println("Rear Tyre is MRF Tyres.");
    }

}

public class Ch_11_Interfaces {
    public static void main(String[] args) {
        AvonCycle nikCycle=new AvonCycle();
        nikCycle.applyBrake(5);
        //You can create properties in interface.
        System.out.println(nikCycle.a);
        //nikCycle.a=70; You cannot modify properties of Interfaces as they are final.

        RajCycles rc=new RajCycles();
        rc.ceatTyres();
        rc.mrfTyres();
        rc.applyBrake(5);
        rc.speedUp(9);
        rc.refTyres();//here if method in interface is default then we can use it.
        //But if the method is private then only the class which inherit can use it.


    }
}












