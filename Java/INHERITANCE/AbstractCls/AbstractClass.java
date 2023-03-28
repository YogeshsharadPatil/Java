package INHERITANCE.AbstractCls;

// abstract method only have declaration not implementation;
// child class is respomsible to provide the implementation;
// if one of the abstract method is present in a class then class must be declared as abstract
// there might have non abstract method in a abstract class
// object creation of abstract class is not possible 
// but we can give reference of abstract class to their child classes
// by that reference u can access overideen method , inherited method but u can not access specialised methoid
// specialised method means only present in child class.  

 abstract class Aeroplane{
      
   abstract public void Takingoff();

    abstract public void fly();

    public void landing(){
        System.out.println("Aeroplane is landing");
    }
  }

   class Cargoplane extends Aeroplane
   {

    public void Takingoff(){   // oveeridden method
        System.out.println("Passengerplane is taking off");
    }
        public void fly(){     // overridden method
        System.out.println("Cargoplane is Taking of");
        }

        public void carrygoods(){    // specialise method
            System.out.println("Cargoplane plane carries goods at loer height ");
        }

        public void report(){
            System.out.println("Give the feedback...");
        }
  }

  class Passengerplane extends Aeroplane{
        public void Takingoff(){   // oveeridden method
            System.out.println("Passengerplane is taking off");
        }

        public void fly(){     // overridden method
            System.out.println("Cargoplane is Taking of");
            }

        public void carrypassenger(){   // specialised
            System.out.println("Passengerplane carry passengers");
        }
  }

public class AbstractClass {
    public static void main(String[] args) {
       // Aeroplane ar = new Aeroplane();// object creation of absract method is not possible
        Aeroplane ref1 = new Cargoplane();
        ref1.Takingoff();
        ref1.fly();
        ref1.landing();
        //ref1.report();// u can not acces specilised method by the abstrract class ref u can access overiddeen and inheritaed method 
      
  
    }
}
