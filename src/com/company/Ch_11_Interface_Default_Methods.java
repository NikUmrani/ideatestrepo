package com.company;

interface Camera{
    void takeSnap();
    void recordVideo();
    default void recordVideo4k(){
        System.out.println("Recording in 4k.");
    }
    private void greet(){//Private methods are used with in the interface only
        System.out.println("Happy Sunday.");//It is used when default methods require methods.
    }
    default void greetings(){
        greet();
        System.out.println("Happy Afternoon");
    }
}

interface Wifi{
    String [] getNetwork();
    void connectToNetwork(String network);

}
class MyCellPhone{
    void callNumber(int number){
        System.out.println("Calling "+number);
    }
    void pickCall(){
        System.out.println("Connecting......");
    }
}

class MySmartPhone extends MyCellPhone implements Wifi,Camera{

    public void takeSnap(){
        System.out.println("Taking a snap.");
    }
    public void recordVideo(){
        System.out.println("Recording a Video.");
    }
    public String [] getNetwork(){
        System.out.println("Getting list of networks: ");
        String [] networkList={"Airtel","BSNL","Vodaphone","Jio"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to ..."+network);
    }

}
public class Ch_11_Interface_Default_Methods {
    public static void main(String[] args) {
        MySmartPhone msp = new MySmartPhone();
        String[] arr = msp.getNetwork();
        for (String item : arr)
        {
            System.out.println(item);
        }
        msp.recordVideo4k();
        msp.greetings();
    }

}
