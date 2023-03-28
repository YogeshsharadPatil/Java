package INHERITANCE;

 class Animal{

   final  void sleep(){
        System.out.println("Animal need good sleep");
    }
}

// class Tiger extends Animal{ // when parent class is final u can not inherite that method
       
// }

class Tiger extends Animal{


}

// class Animal2 extends Animal{
//     void sleep(){  // u can not override final method and variable

//     }
// }




public class Finalkey {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();// when method is final u can not override that method
    }
}
