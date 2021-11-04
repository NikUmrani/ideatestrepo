package com.company;

class Circle{
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double areaOfCircle(){
        return Math.PI*radius*radius;
    }

    public double perimeterOfCircle(){
        return 2*Math.PI*radius;
    }

}

class Cylinder1 extends Circle{
    double height;
    public double volumeOfCylinder(){
        return Math.PI*radius*radius*height;
    }
    public double surfaceAreaOfCylinder(){
        return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius*radius);
    }

}




public class Ch_10_Practice_Circle_Cylinder {
    public static void main(String[] args) {
        Circle cs=new Cylinder1();






    }
}
