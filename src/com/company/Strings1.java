package com.company;

import java.util.Locale;

public class Strings1 {
    public static void main(String[] args) {

        String s1="Nikhil";
        int val1=s1.length();
        System.out.println(val1);

        String lstr=s1.toLowerCase();
        System.out.println(lstr);
        String ustr=s1.toUpperCase();
        System.out.println(ustr);

        String ntrim="    Nikhil    ";
        System.out.println(ntrim);
        System.out.println(ntrim.trim());

        String  name= "Nikhil Mubarak Umrani";
        System.out.println(name.substring(3));

        System.out.println(name.substring(5,11));

        String name1= name.replace('i','k');
        System.out.println(name1);

        String name2=name.replace("hil","yep");
        System.out.println(name2);

        System.out.println(name.startsWith("Nik"));
        System.out.println(name.startsWith("Mub"));

        System.out.println(name.endsWith("ani"));

        char c1=name.charAt(3);
        System.out.println(c1);

        int ind=name.indexOf('k');
        System.out.println(ind);//returns -1 when value is not found.















    }
}
