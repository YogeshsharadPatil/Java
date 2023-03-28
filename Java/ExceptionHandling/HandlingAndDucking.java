package ExceptionHandling;

import java.util.concurrent.RecursiveTask;

// What is ducking:
/* Ducking means suppose fresher got the some error/exception at that time if he doent want to solve it 
 * then he can send it to his manager and his manager will handle that error/exception
 * or else manager doesnt want to solve it then he can send it to his senior manager
 */
class Company{
    public void fresher()
    { 
        try{
            client();
        }
        catch(Exception e ){
            System.out.println("Error...." + e);
        }
     
    }
    public void client() throws Exception{
        int num1 = 9;
        int num2 = 0;
        int result = 0;

        result = num1/num2; // this is critical section it might throw ecxeption any one has to handle it 
        System.out.println(result);// client doent want to handle so he send it fresher // this is called ducking
    }
}

public class HandlingAndDucking {
    public static void main(String[] args) {
        Company c = new Company();
        c.fresher();
    }
}
