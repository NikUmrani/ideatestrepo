package com.company;

class Cylinder{
    double radius;
    double height;

    public void setRadius(double r){

        radius=r;
    }

    public void setHeight(double h){

        height=h;
    }

    public double getRadius(){
        return radius;
    }

    public double getHeight(){
        return height;
    }

    public double calSurfaceArea(){

        return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
    }

    public  double calVolume(){
        return (Math.PI*radius*radius*height);
    }



}

class CylinderNew{
    double rad;
    double hgt;
    public CylinderNew(){
        rad=10;
        hgt=10;
    }
    public CylinderNew(double r1,double v1){
        rad=r1;
        hgt=v1;
    }
    public double calSurfaceArea(){

        return (2*Math.PI*rad*hgt)+(2*Math.PI*rad*rad);
    }

    public  double calVolume(){
        return (Math.PI*rad*rad*hgt);
    }

}


public class Ch_09_Practice_Cylinder {

    public static void main(String[] args) {

        Cylinder cl=new Cylinder();

        cl.setHeight(50);
        cl.setRadius(45);

        System.out.println("The Height of Cylinder is "+cl.getHeight());

        System.out.println("The Radius of Cylinder is "+cl.getRadius());

        System.out.printf("The Volume of the Cylinder is %.3f\n",cl.calVolume());

        System.out.printf("The Surface Area of the Cylinder is %.3f\n",cl.calSurfaceArea());

        CylinderNew c2=new CylinderNew();
        System.out.printf("The Volume of the Cylinder is %.3f\n",c2.calVolume());

        System.out.printf("The Surface Area of the Cylinder is %.3f\n",c2.calSurfaceArea());

        CylinderNew c3=new CylinderNew(70,59);
        System.out.printf("The Volume of the Cylinder is %.3f\n",c3.calVolume());

        System.out.printf("The Surface Area of the Cylinder is %.3f\n",c3.calSurfaceArea());




    }
}
