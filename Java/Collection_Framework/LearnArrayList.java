package Collection_Framework;

import java.util.*;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList arl1 = new ArrayList<>();
        // u can also create like
        //List arl1 = new ArrayList();
        // Arraylist implements list interface
        

        // ArrayList store both heterogenous and homogenous type of data
        // Arraylist store the data in the form of object(e.g. Integer obj, string obj)
        // u can store the data or change the data basedon index based inserting but it is not highly recommended
        // ArrayList class implements list interface
        
        arl1.add(100);
        arl1.add(200);
        arl1.add(300);
        arl1.add(0, 10);

        System.out.println(arl1);
        System.out.println("********************************************************");

        ArrayList arl2 = new ArrayList<>();
        arl2.add(100);
        arl2.add("Ysp is great");
        arl2.add(5.2);
        System.out.println(arl2);
        System.out.println("*********************************************************");

        System.out.println("Index based insserting");
        ArrayList arl3 = new ArrayList<>();
        arl3.add(1);
        arl3.add(2);
        arl3.add(3);
        arl3.addAll(arl1);
        System.out.println(arl3);

        System.out.println("***********************************");
        // contains();
        System.out.println( arl1.contains(200));  
        System.out.println("***********************************");
        int num =  arl1.indexOf(100);
        System.out.println(num);
        System.out.println("***********************************");
        System.out.println(arl1.size());
        System.out.println("***********************************");
        arl1.clear();
        System.out.println(arl1);
        System.out.println("***********************************");


    }
}
