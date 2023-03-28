public class String_stringbuffer {
    public static void main(String[] args) {
        String brand ="YSP";
        brand.concat(" Great");
        StringBuilder brand2 = new StringBuilder("Patil");
        brand2.append(" , the Brand");
// Only String is applicable for mutable 
// while Stringbuilder is applicable for mutable we can change the string
        System.out.println(brand);
        System.out.println();
        System.out.println(brand2);

        
    }
}
