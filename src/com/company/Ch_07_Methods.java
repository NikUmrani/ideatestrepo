package com.company;

public class Ch_07_Methods {

    static int logic(int x,int y){//Here static keyword is used. This method can be used w/o object creation within the class.
        int z;
        if(x>y){
            z=x+y;
        }
        else
        {
            z=(x+y)*5;
        }
        return z;
    }


    int logic1(int p,int q)//this method is w/o static keyword, so object should be created for its use.
    {
        return (p*p*q*q);

    }

    static void tellJoke(){
        System.out.println("I invented a new word\n Plagiarism!");

    }
    static void change(int aa){
        aa=99;//Tries to change the original value but doesn't change as it creates only copy.
    }

    static void change2(int []array1)
    {
        array1 [0]=125;
    }

    static int muti(int... arr)
    {
        int result=0;
        for (int a1:arr)
        {
            result=result+a1;
        }
        return result;
    }

    static void foo()
    {
        System.out.println("This is foo() method w/o arguments.");
    }
    static void foo(int xy)
    {
        System.out.println("This is foo() method with one argument as : "+xy);

    }
    static void foo(int xx,int yy)
    {

        System.out.println("This is foo() method with two arguments as: "+xx+" and "+yy);
    }




    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c;
        c=logic(5,10);
        System.out.println(c);


        Ch_07_Methods log=new Ch_07_Methods();
        c=log.logic1(5,4);
        System.out.println(c);
        tellJoke();
        int marks[]={54,77,84,63,25};
        int x=45;
        change(x);
        System.out.println("The value of x after running change is "+x);//x doesn't change
        change2(marks);
        System.out.println("The value of array after running change2 is "+marks[0]);//here the marks[] change.
        //The reason why change2 method changes the array value itself is
        //that the argument passed is actually a pointer to the array and not the value itself.
        //Here copy of the pointer value is created and the value is replaced.
        //But in non array data types the actual value remains intact as it makes a copy of the value.

        //VARARGS
        //when we don't know the limit of arguments then we use varargs.

        System.out.println("Here We test Varargs !!!");
        System.out.println("Sum of 4 nos "+muti(5,4,5,7));
        System.out.println("Sum of 5 nos "+muti(4,7,5,8,8,7,5));

        //Method Overloading

        foo();
        foo (5);
        foo(4,6);





    }
}
