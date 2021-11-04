package com.company;

class MyEmployee{
    private int id=150;
    private String name="Prakash Patil";


    public void setName(String n){
        name=n;
    }

    public void setId(int i){
        id=i;
    }

    public  int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public MyEmployee(String myName){
        name=myName;
    }
    public MyEmployee(){
        name="Nikhil";
    }

}




public class Ch_09_Access_Modifier_and_Constructors {
    public static void main(String[] args) {

        MyEmployee nik=new MyEmployee();
        
        //nik.name="Nikhil"; Throws error as the variable is set private.

        nik.setId(101);
        nik.setName("Nikhil Umrani");

        System.out.println(nik.getId()+"   "+nik.getName());

        MyEmployee praP=new MyEmployee();// this is constructor definition where default values are taken.

        System.out.println(praP.getId()+"   "+praP.getName());

        MyEmployee ran=new MyEmployee();
        System.out.println(ran.getName());



    }






   // nik.id=45;
    //nik.name="Nikhil Umrani";




}
