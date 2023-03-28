package INHERITANCE;

class Human{

    private String name ;
    int age = 6;

     Human(){
        System.out.println("Human class constructor");
     }
    void sleep(){
        System.out.println("Human have a good Sleep " + age );
    }
}

class Student extends Human{
    // in the back side default constructor gets called 
    // Student(){
    //     // first method in constructor gets called is super()
    //     super();
    // }
     void disp(){
        System.out.println("human age is " + age);
       // System.out.println("Human name is " + name); // uncomment it will show error on name as private member are not inherited
     }
}
public class Inheritance1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.sleep();
    }
}
// in inheritance private member and constructor du not inherited in child class 
// but constructor of parent class gets executed as default constructor / constructor of child class 
// runs when object is created at that time in a constructor first method is called is super 
// so super methods work is to call the construtor of parent class.