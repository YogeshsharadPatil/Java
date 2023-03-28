package Interfaces;

// any service requirement between client and service provider is called Interface
// 100% abstract class is considered as INTERFACE
// In case of Interfaces all method are by default public and abstract , where as variables are public final static 
// we can not create object of interface 
// but we can use refernce of interface
//implements keyword is used



interface A{
    void show();
}

interface A1{
    void display();
}
 
abstract class B implements A,A1{
    public void show(){
        System.out.println("In show...");
    }
}
// when class is implementing interfaces then class must provide implementation to all the methods else child class is responsible 
// otherwise child class is responsible to provide the implementation then parent class must be declared as abstract.
class C extends B{
    public void display(){
        System.out.println("In display...");
     }
}



public class InterfaceIntro {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
    }
}
