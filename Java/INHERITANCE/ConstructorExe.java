package INHERITANCE;

class Demo1 {

    public Demo1() {
        System.out.println("Constructor of demo1 ");
    }
    public Demo1(int x,int y){
        System.out.println("Parameterised Constructor of demo1");
    }

}

class Demo2 extends Demo1 {
    public Demo2() {
        // super() default super method is there if we do not mention the super method
        // 1)super() method clls the parent class constructor based on the parameter
           //3.to cll the same classes all constructor use this() method
        this(10,20);
        System.out.println("Constructor of demo2 ");
    }
    public Demo2(int x, int y){
       //2. super(x, y);
      System.out.println("Parameterised constructor of demo2");//2. here default super() method is there
                                                            //which call the constructor of parent according to parameter
                                                            // this super() method clls parameterised constructor of demo1
    }
}

public class ConstructorExe {
    public static void main(String[] args) {
      //  Demo2 d = new Demo2();// 1)here constructor gets called of demo2
      //  Demo2 d1 = new Demo2(10,15);// 2)it will cll parameterised constructor of demo2

        // if you want to cll the constructor of same class then use this method

    Demo2 d2 = new Demo2();//3.

    // in case of constructor parent class constructor will be executed follwed by child class with the help of super method
    //internally jvm will promote super() to constructor chaining in inheritance level. 
    }

}
