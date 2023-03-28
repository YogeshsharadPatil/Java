package ExceptionHandling;

class MyException extends Exception {
    MyException() { // if u wnt to send msg through non parameterised constructor
        System.out.println("Enter Valid number ");
    }

    MyException(String msg) {
         System.out.println("in myException class");
    }
}

public class ThrowKeyword {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = -2;
        try {
            if (num2 < 0) {
                // 1. System.out.println("Enter valid number"); // so we are repeating the same
                // concept dont do it in programming so here
                // dont do repeat
                /*
                 * throw methods came in action
                 * throw will throw a specific exception
                 * throw requires object of exception
                 */
                // 2. Exception e = new Exception(); // if there is other exceptio other than
                // present in catch at this time u can
                // throw e; // create new classes and assign that class object to throw it will
                // throw that object as error msg

                // 3.
                throw new MyException("Enter valid number");

            }

            int result = num1 / num2;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Enter valid Number...");
        }

    }
}
