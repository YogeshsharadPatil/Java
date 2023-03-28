package ExceptionHandling;

public class TryCatch2 {
public static void main(String[] args) {
    int a = 5;
    int b = 1;
    int result= 0;
    int arr[] = {1,2,3,4};

    try{
          result = a/b;//if first line is correct then and only then second line works
          System.out.println(arr[5]);//it will go for the catche of first line exception
    }
    catch(ArithmeticException e){
        System.out.println("You are dividing by zero so ans: Infinity" + e);
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e);
    }

    System.out.println(result);
}
}
