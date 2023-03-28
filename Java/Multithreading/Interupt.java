package Multithreading;
// inturrupt method inturrupt a thread only if it is in a waiting/block state

// it doesnt impact if it is in a runnable thread
// if there is sleep() or wait() method is there we can inturrupt thread

import java.nio.channels.spi.SelectorProvider;

class Example implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {

                System.out.println("Learning iturrupt method..");
                Thread.sleep(2000);
            }

            catch (InterruptedException e) {
                // TODO: handle exception
                System.out.println("Inturrupt occur " + e);
            }
        }
    }
}
public class Interupt {
 
    public static void main(String[] args) {
        Example ex = new Example();
        Thread t1 = new Thread(ex);

        t1.start();
        t1.interrupt();
    }
}
