package com.company;

class Red{
    static
    {
        System.out.println("Static block of Class Red.");
    }
    {
        System.out.println("Instance Block of Class Red.");
    }

}
public class Ch_15_Static_Instance {
    static
    {
        System.out.println("Static block of Class Red.");
    }
    {
        System.out.println("Instance Block of Class Red.");
    }


    public static void main(String[] args) {
        //Red rd=new Red();
        Ch_15_Static_Instance dd=new Ch_15_Static_Instance();

    }
}
