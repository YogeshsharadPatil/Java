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

class Lion extends Tiger{


}
public class Inheritance3 {
    public static void main(String[] args) {
        Lion l = new Lion();
        l.sleep();
    }
}
