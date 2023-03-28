package Multithreading;

import java.util.Scanner;

class Mythread  extends Thread{
    public void run(){
      String tname = Thread.currentThread().getName();
      if (tname.equals("Calc")) {
        calculate();
      } else {
        impmessage();
      }
    }

    public void calculate(){
        int num1 ,num2;
    
        System.out.println("Calculation part is  Started...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();
        System.out.println("Calculation part is  ended...");
    }

    public void impmessage(){
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
public class OneRunMethodTwoDifferentTask {
    
    public static void main(String[] args) {
        
        Mythread thread1 = new Mythread();
        Mythread thread2 = new Mythread();
      

        thread1.setName("Calc");
        thread2.setName("print");

        thread1.start();
        thread2.start();
      
    }
}
