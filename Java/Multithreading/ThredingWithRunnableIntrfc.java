package Multithreading;

import java.util.Scanner;

class calc implements Runnable{
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

class message implements Runnable{
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

public class ThredingWithRunnableIntrfc {
    public static void main(String[] args) {
         calc c = new calc();
         message m = new message();

         Thread t1 = new Thread(c);
         Thread t2 = new Thread(m);
         t1.start();
         t2.start();

         

    }
}
