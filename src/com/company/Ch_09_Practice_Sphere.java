package com.company;

class Sphere{
    double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double volumeOfSphere(){

        return (4D/3D)*Math.PI*(radius*radius*radius);
    }
    public double surfaceAreaOfSphere(){
        return (4D*Math.PI*radius*radius);
    }

    public void display(){
        System.out.println("The Radius of Sphere is "+radius);
        System.out.println("The Volume of Sphere is " +volumeOfSphere());
        System.out.println("The Surface Area of Sphere is "+surfaceAreaOfSphere());

    }
}

public class Ch_09_Practice_Sphere {
    public static void main(String[] args) {
        Sphere sp=new Sphere();
        sp.setRadius(50);
        sp.display();
    }
}
