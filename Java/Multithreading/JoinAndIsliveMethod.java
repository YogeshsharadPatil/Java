package Multithreading;
// join method:- 
// Some times one perticular thread doent complete his work before that another thread complete his work 
//" join method is used for to run one thread after another"
// islive(): check the life of thread
// by invoking the start method thread has a life
class mythread2 implements Runnable{
    public void run(){
     try {
        for (int i = 0; i < 3; i++) {
            System.out.println("Focus is more important");
        }
     } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
     }
    }
}

public class JoinAndIsliveMethod {
    public static void main(String[] args)  throws Exception{
        System.out.println("New task is started");

        mythread2 obj = new mythread2();
        // as we have used runnable so specifically create runnable
        Thread trd1 = new Thread(obj);
        trd1.isAlive();//false
        trd1.start();
        trd1.isAlive();//true



        // join method to not print another task"i.e. next sysout stsment""
        trd1.join();
        System.out.println("Another task");

    }
}
