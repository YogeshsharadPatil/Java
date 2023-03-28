package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch5 {
    public static void main(String[] args) {
        // Finally block
        // Even though if there is no exception but you have to execute some code then finally is used
        // generally used for the closing the resources
        // u are seeing the bank details and in between that power is off so it must close the account at that time finally is used
   
        String name ;
        Scanner sc = new Scanner(System.in);
        // we can not use catch without try 
        // catch(InputMismatchException e ){
        //      System.out.println(e);
        // }
        // finally{
        //      sc.close();
        // }
}
}
