package INHERITANCE.Polymorphism;

class Aeroplane{
    public void takeoff(){
        System.out.println("AeroPlane will take off");
    }
    public void fly(){
        System.out.println("Aeroplane will fly");
    }
}

class Cargoplane2 extends Aeroplane{
     public void takeoff(){
        System.out.println("Cargoplane will takeoff");
     }
     public void fly(){
        System.out.println("Cargoplane will fly");
    }
}

class Passengerplane2 extends Aeroplane{
    public void takeoff(){
        System.out.println("Passengerplane will takeoff");
     }
     public void fly(){
        System.out.println("Passengerplane will fly");
    }
}

class Fighterplane2 extends Aeroplane{
    public void takeoff(){
        System.out.println("Fighterplane will takeoff");
     }
     public void fly(){
        System.out.println("Fighterplane will fly");
    }

}

class Airport extends Aeroplane{
    public void poly(Aeroplane ref){ //ref will store address of Aeroplane class and its child classes
        ref.takeoff();                // same function which is collecting different ref of each class and calling its methods
                                      // same method changing its behavior in different situation at runtime
        ref.fly();                    // so runtime polymorphism is there
    }
}

public class RuntimePoly {
    public static void main(String[] args) {
        Aeroplane a = new Aeroplane();
        Cargoplane2 cp = new Cargoplane2();
        Passengerplane2 pp = new Passengerplane2();
        Fighterplane2 fp= new Fighterplane2();
        Airport ap = new Airport();
        ap.poly(cp);
        ap.poly(pp);
        ap.poly(fp);

        // poly fn is behaving differently for different objects in a runtime so it is eg of runtime polymorphism.

    }
}
