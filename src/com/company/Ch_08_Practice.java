package com.company;

class Employee{

    int salary;
    String name;

    public int getSalary(){

        return salary;
    }

    public String getName(){
        return  name;
    }

    public void setName(String n){

        name=n;
    }


}

class CellPhone{

    public void ring(){
        System.out.println("Ringing......");
    }
    public void vibrate(){
        System.out.println("Vibrating.....");
    }

    public void callFriend(String s){

        System.out.printf("Calling %s .....",s);
        System.out.println();
    }

}

class Square{

    public int areaOfSquare(int side){

        return side*side;

    }

    public int perimeterOfSquare(int side){

        return 4*side;

    }

}



public class Ch_08_Practice {
    public static void main(String[] args) {
        //Problem 1
        Employee nik=new Employee();

        nik.setName("Nikhil Umrani");

        System.out.println(nik.getName());

        nik.salary=1020;

        System.out.println(nik.getSalary());

        //Problem 2.

        CellPhone cp=new CellPhone();

        cp.ring();
        cp.vibrate();
        cp.callFriend("Nikhil");

        //Problem 3

        Square sq=new Square();

        int side =10;

        System.out.println("Area of Square is "+sq.areaOfSquare(side));

        System.out.println("Perimeter of Square is "+sq.perimeterOfSquare(side));






    }







}
