package com.company;

class Superclass{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    Superclass(){
        System.out.println("I am Superclass Constructor.");
    }
    Superclass(int a){

        System.out.println("I am a Overloaded Superclass Constructor with value "+a);
    }



}
class Child extends Superclass{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public Child(){
        //super(10);
        System.out.println("This is Child Constructor.");
    }
    Child(int a){
        System.out.println("This is Overloaded Child Constructor with value "+a);
    }
}

class GranChild extends Child{
    GranChild(){
        super(80);
        System.out.println("This is GrandChild Constructor.");
    }
    GranChild(int b){
        System.out.println("This is Overloaded Constructor with value "+b);
    }

}
public class Ch_10_Inheritance_Constructors {
    public static void main(String[] args) {

        //Superclass obj=new Superclass(5);

        //Child chd=new Child(50);

        GranChild gndch= new GranChild(60);





    }
}
