package INHERITANCE;

class Animal{

    Animal(){
        System.out.println("Constructor of parent class");
    }
    void sleep(){
        System.out.println("Animal need good sleep");
    }
}

class Tiger extends Animal{

}


public class Inheritance2 {
    public static void main(String[] args) {
     Tiger t = new Tiger();
     t.sleep();   
    }
}
