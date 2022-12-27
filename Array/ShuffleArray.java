package Array;

import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        
        // https://leetcode.com/problems/shuffle-the-array/

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter half of the array length : ");
        int n = inp.nextInt();
        int[] nums = new int[2*n];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = inp.nextInt();
        }
        int[] shuffle = new int[2*n];
        // shuffle[0]=nums[0];
        int j=0;
        for (int i = 0; i < shuffle.length; i++) {
            // shuffle[i ]=nums[i];
            // shuffle[i+1]=nums[i+n];
            if(i%2 == 0) {
                shuffle[i]= nums[i/2];}
            else{
               
                shuffle[i]=nums[(n+j)];
                j++;
            }
        }
        System.out.println("After shuffle : ");
        for (int i = 0; i < shuffle.length; i++) {
            System.out.println(shuffle[i]);
        }
    }
}
