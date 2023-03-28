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

class Lion extends Animal{

}

public class Inheritance4 {
    public static void main(String[] args) {
        Lion l = new Lion();
        l.sleep();
    }
}
