package com.company;
abstract class Parent2{
    abstract public void greet();
    abstract public void lunch();
    public void sayHello(){
        System.out.println("hello");
    }
}

class Child2 extends Parent2{
        @Override
        public void greet(){
            System.out.println("Hello.Good Morning.");
        }
        public void lunch(){
            System.out.println("Lunch at 12:30.");
        }
        public void dinner(){
            System.out.println("Dinner at 9:00.");
        }
}

abstract class Child3 extends Parent2{
    //If we don't want to use abstract method then the class should be declared as abstract.
    //Also object cannot be created of abstract classes.

    public void th(){
        System.out.println("Child 3 Class th Method");
    }
//    @Override
//    public void greet(){
//        System.out.println("Child 3 Class Hello.");
//    }

}
public class Ch_11_Abstract_Class {
    public static void main(String[] args) {

        Child3 ch3= new Child3() {
            @Override
            public void greet() {
                System.out.println("This is Afternoon");
            }

            @Override
            public void lunch() {
                System.out.println("Lunch at 1:30;");
            }
        };//here is a way where an abstract class object is created.

        ch3.lunch();
        ch3.greet();
        Parent2 dw=new Child2();
        dw.lunch();
        //dw.dinner();this is error as this method is exclusively in Child2 Class.
        dw.sayHello();
        Child2 re=new Child2();
        re.dinner();





    }
}
