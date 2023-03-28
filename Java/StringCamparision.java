//import javax.swing.event.SwingPropertyChangeSupport;

public class StringCamparision {
  public static void main(String[] args) {
      // there are basic two methods == and equals
    // == MEthod campare the string references 
    // equals() method check the actual content
    // revise:- in string constant pool duplicates are not allowed 
    // when we use new keyword memory is ceated in heap area but outside the SCP
    // in SCP duplicates are not allowed but outside the string constant pool duplicates allowed

    String s1 = "YogeshIsGreat";
    // memory is created within scp
    String s2 = new String("YogeshIsGreat");
    //memory is created outside the scp
    String s3 = "YogeshIsGreat";
    String s4 = "Differentstring";
    // memory is created in scp , already with the same content memory is assigned so s3 points to that reference only

    // == check the references while equals() to check the actual content
    // ==
    System.out.println(s1==s2);//false
    System.out.println(s1==s3);//true//same reference
    
    // equals() checks the actual content
    System.out.println(s1.equals(s2));//true
    System.out.println(s1.equals(s3));//true
    System.out.println(s1.equals(s4));///false

   // Yogesh you are great
    
   String sa = new String("pwConcept");
   String sb = new String("pwConcept");
   // two string two different references but duplicates are allowed
   // == gives false ans equals() gives true
  
    System.out.println(sa==sb);//false
    System.out.println(sa.equals(sb));//true



    
  }
 }
