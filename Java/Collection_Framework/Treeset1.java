package Collection_Framework;

import java.util.TreeSet;

public class Treeset1 {
    public static void main(String[] args) {
        // Treeset collection implements set interface
        // order of insertion doesnt matter here
        // Prints value in sorted manner
        // for the sorting it follows inorder traversal i.e. LNR
        // less than node then in left side
        // greater than node then in the right side
        // it doesnot allow duplicate values



        TreeSet ts = new TreeSet();

        ts.add(100);
        ts.add(150);
        ts.add(75);
        ts.add(50);
        ts.add(200);
        ts.add(25);

        System.out.println(ts);

        System.out.println(ts.higher(50));
        System.out.println(ts.lower(50));
        System.out.println(ts.lower(40));

        // similar method but quite different
       System.out.println(ts.ceiling(60));
       System.out.println(ts.ceiling(50));
       System.out.println(ts.floor(60));
       System.out.println(ts.floor(50));



    }
}
