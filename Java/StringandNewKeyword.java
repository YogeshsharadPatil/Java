public class StringandNewKeyword {
    public static void main(String[] args) {
        String s1 = "Have a great day";
        String s2 =  "Have a great day";
        System.out.println(s1==s2);
        // when we use a string , memory will be assigned in a heap area and in a string contant pool so in a string constant pool
        //  so in a string constant pool duplicates are not allowed one string is created and other is created with the same string value then 
        // one values is created in a String constant pool and both variable point to a that value only

        String s3 = new String("Krishna is with you");
        String s4 = new String("Krishna is with you");        
        System.out.println(s3==s4);
         // But when we use string with new keyword then memory is alloated in the heap area but out side the strig constant pool where duplicated are allowed 
         // if the same string is created with two different variables then both refer to a different memory location
    }
}
