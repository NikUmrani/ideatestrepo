package com.company;

class Rectangle{
    int lenght;
    int breadth;

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLenght() {
        return lenght;
    }

    public int getBreadth() {
        return breadth;
    }

    public Rectangle(){
        this.lenght=4;
        this.breadth=5;
    }
    public Rectangle(int lenght,int breadth){
        this.lenght=lenght;
        this.breadth=breadth;
    }

    public int areaOfRectangle(){
        return lenght*breadth;
    }
    public int perimeterOfRectangle(){
        return 2*(lenght+breadth);
    }

    public void display(){
        System.out.println("The Length of the Rectangle is "+lenght);
        System.out.println("The Breadth of the Rectangle is "+breadth);
        System.out.println("The Area of the Rectangle is "+areaOfRectangle());
        System.out.println("The Perimeter of the Rectangle is "+perimeterOfRectangle());
    }

}




public class Ch09_Practice_Rectangle {
    public static void main(String[] args) {
        Rectangle ret=new Rectangle();
        //ret.display();
        Rectangle ret1=new Rectangle(20,50);
        //ret1.display();
        Rectangle ret2=new Rectangle();
        ret2.setLenght(85);
        ret2.setBreadth(95);
        System.out.println(ret2.getLenght());
        System.out.println(ret2.getBreadth());
        System.out.println(ret2.areaOfRectangle());
        System.out.println(ret2.perimeterOfRectangle());
        ret2.display();

    }
}
