package Multithreading;

class mythread extends Thread{
    public void run(){
        System.out.println("In my thread");
        
    }

}

public class CreateNewThread {
    public static void main(String[] args) {
        // u can ceate new thread by using two ways
        // first is by extending thread class
        // second by implementing runnable interface
        // there is run method is present in runnable interface
        // its implementation is present in Thead class 
        //u can override this run method in your class by extending Thread class.
        //task of thread must b written in run method
        mythread t = new mythread();
        t.start();

        

    }
}
