interface car{
    void drive();
}

public class AnnonymosInnerClass {
    public static void main(String[] args) {
        car obj = new car(){    ///
      public void drive(){
            System.out.println("Driving the car");
        }
        };  // draw back is u can create only once 

        obj.drive();
    }
}
