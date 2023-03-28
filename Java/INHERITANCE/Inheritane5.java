package INHERITANCE;

import java.security.PublicKey;

class Aeroplane{
      
    public void Takingoff(){
        System.out.println("Aeroplane is Taking off");
    }

    public void fly(){
        System.out.println("Aeroplane is Flying");
    }

  }

   class Cargoplane extends Aeroplane{
        public void fly(){     // overridden method
        System.out.println("Cargoplane is Taking of");
        }

        public void carrygoods(){    // specialise method
            System.out.println("Cargoplane plane carries goods at loer height ");
        }
  }

  class Passengerplane extends Aeroplane{
        public void Takingoff(){   // oveeridden method
            System.out.println("Passengerplane is taking off");
        }

        public void carrypassenger(){   // specialised
            System.out.println("Passengerplane carry passengers");
        }
  }

public class Inheritane5 {
    public static void main(String[] args) {
        
        Cargoplane cp = new Cargoplane();
        cp.Takingoff();
        cp.fly();
        cp.carrygoods();

        Passengerplane pp = new Passengerplane();
        pp.Takingoff();
        pp.fly();
        pp.carrypassenger();

    }
}
