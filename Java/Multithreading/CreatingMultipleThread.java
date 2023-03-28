package Multithreading;

import java.util.Scanner;

class calc extends Thread{
    public void run(){
        int num1 ,num2;
    
        System.out.println("Calculation part is  Started...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();
        System.out.println("Calculation part is  ended...");
    }
    
}

class message extends Thread{
    public void run(){
        try{
            System.out.println("New task is started");
            System.out.println("Printing important msg");
            for (int i = 0; i < 3; i++) {
                System.out.println("Focus is more important...");
                Thread.sleep(2000); // may be exception occur at this critical situation so try catch
            }  
            System.out.println("Printing important msg task is ended");
        }
        catch(Exception e){
            System.out.println("Some problem...");
        }
       
    }
   
   
}
public class CreatingMultipleThread {


    public static void main(String[] args) {


        // int num1 ,num2;
        // System.out.println("Calculation part is  Started...");
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first number");
        // num1 = sc.nextInt();
        // System.out.println("Enter second number");
        // num2 = sc.nextInt();
        // System.out.println("Calculation part is  ended...");
        // System.out.println("New task is started");
        // System.out.println("Printing important msg");
        // for (int i = 0; i < 3; i++) {
        //     System.out.println("Focus is more important...");
        // }  
        // System.out.println("Printing important msg task is ended");

        // // now here calculation of two num is one task 
        // // printing important msg is another task
        // // but if we enter first num and didnt enter second number then next part after the num2 getting value from console
        // // till that time no furthr task is going on
        // // its waiting for num2 only
        // // where as printing msg is different task
        // // one task is impacting on another task..
        // // this implies system slowdown..?
        // // This problem can b solved using multithreading
        // // for each task one thread is there 
        // // bydefault main thread is there
        // // Thread scheduler will handle all the threads
        // // Jvm will manage thread scheduler.

        calc t1 = new calc();
        message t2 = new message(); 
        t1.start();
        t2.start();

      




    }
}
