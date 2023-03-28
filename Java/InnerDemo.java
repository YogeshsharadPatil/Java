
class A {

    public void show() {
        System.out.println("in A show");
    }

     class B {
        public void display() {
            System.out.println("in display");
        }
    }
}

public class InnerDemo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
          // A.B obj1 = new A.B(); // if class B  is static 
        obj1.display();
    }
}