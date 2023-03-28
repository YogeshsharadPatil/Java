package Multithreading;
// SYnchronised keyword is used when one resource is going to share among multiples threads/people
// at that time synchronised keyword is used
// e.g suppose one car can drive only one peron but three are willing to manage this synchronised keyword is used
// one thread at at time for the synchronised block in java
class Verana implements Runnable{
  public void run(){
        
    try {
        System.out.println(Thread.currentThread().getName() + " Has entered the parking lot");
        Thread.sleep(2000);
        synchronized(this){
            System.out.println(Thread.currentThread().getName() + " Found car and got into it to drive car");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + " comeback and parked");
        Thread.sleep(2000);
        }
     
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }
  }

}

public class SynchronisedKey {
    public static void main(String[] args) {

        Verana v = new Verana();
        Thread t1 = new Thread(v);
        Thread t2 = new Thread(v);
        Thread t3 = new Thread(v);
        
        t1.setName("son1");
        t2.setName("son2");
        t3.setName("son3");

        t1.start();
        t2.start();
        t3.start();


    }
}
