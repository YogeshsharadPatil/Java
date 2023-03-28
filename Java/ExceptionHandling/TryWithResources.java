package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        // Finally block
        // Even though if there is no exception but you have to execute some code then
        // finally is used
        // generally used for the closing the resources
        // u are seeing the bank details and in between that power is off so it must
        // close the account at that time finally is used

        String nm;

        // Try with resource
        // means using only try method u can close the resource without using finally
        try (Scanner sc = new Scanner(System.in)) {
            nm = sc.next();
            System.out.println(nm);
        }

    }
}
