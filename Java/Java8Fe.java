interface A{

    void show();
    // in java8  we can define the methods by only using default and static keyword
    
    default void display(){
        System.out.println("in display...");
    }

    static void create(){
        System.out.println("in create...");
    }
}

class B implements A{
    public void show(){
        System.out.println("In show");
    }
}
public class Java8Fe {

    public static void main(String[] args) {
        A.create(); // u can access static method by only using interface name
        // but for to cll the display method we have to implement that interface into a class and by the object of that class u can cll other methods
        B obj = new B();
        obj.show();
        obj.display();
    }
}
