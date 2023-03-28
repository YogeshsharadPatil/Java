import java.util.Scanner;

class arrayAndEnhancedForLoop {
    public static void main(String[] args) {
        int nums[] =new int[5];
         for(int i = 0; i<nums.length;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
             nums[i] = sc.nextInt();
         }
         
         for (int nm : nums) {
                  System.out.println(nm + " ");
        }
    }
}
