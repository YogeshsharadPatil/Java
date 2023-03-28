public class StringConcat {
    public static void main(String[] args) {
        // String s1 = "pwskills";
        // //s1.concat(" Java");
        // //System.out.println(s1);// as it will print only pwskills , because strings are getting concatinated but at the new memory location 
        // // where s1 is not pointing so it is printing the original pwskills as s1 is still pointing to it.
        // String s2 = s1.concat(" Java");
        // System.out.println(s2);
        
       // String s3 = 
       // as only we are using String so string is immutable but we are getting the refernce of the immutable string s1 
       // and concatinating with string value so here for the s2 as we are not using new so there must that memory is created in a scp if we directly intialise a string and then concatinating
       // but we are initialising the string with another string reference or using a method then memory is created outside the scp 
       // and this refernce is given to s2;

    //    // + 
    
    // String s1 = "pwskills";
    // String s2 = "Pwskills" + "java";
    // String s3 = "Pwskillls" + "Java" + "Banglore";
    // String s4 = s1 + s2;
   
    // System.out.println(s1);
    // System.out.println(s2);
    // System.out.println(s3);
    // System.out.println(s4);

    // // for the + we are not using new keyword in s1,s2,s3 so memory is assigned in Scp 
    // // but for the s4 we are using references memory is outside the Scp in heap area
    
    // String s1 = "Java" + 100 + 200;
    // System.out.println(s1);

//    String sc = "PatilSaheb";
//    sc.concat("100"); // u have to use "" in the concat method 

    }
}
    