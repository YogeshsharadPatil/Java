package ExceptionHandling;

public class TryCatch3 {
    
public static void main(String[] args) {
    int a = 5;
    int b = 1;
    int result= 0;
    int arr[] = {1,2,3,4};
    String name = null;

    try{
          result = a/b;//if first line is correct then and only then second line works
          System.out.println(arr[0]);//it will go for the catche of first line exception
         name.length();
        }
    catch(ArithmeticException e){
        System.out.println("You are dividing by zero so ans: Infinity" + e);
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e);
    }catch(Exception e){// it is better to write this statement after every catch
                        // if u dont know the error it will give u
            System.out.println("Something went wrong..." + e);
    }

    System.out.println(result);
}
}
