package ExceptionHandling;

public class TryCatch1 {
    
public static void main(String[] args) {
    int a = 100;
    int b = 0;
    int result= 0 ;

    try{
        result = a/b;
        System.out.println("In try ...");
    }
    catch(Exception e){
      System.out.println("Something went wrong.." + e);

    }
    System.out.println(result);

}
}
