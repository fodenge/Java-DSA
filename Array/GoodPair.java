package Array;

import java.util.Scanner;

public class GoodPair {
    public static void main(String[] args) {
        
        // https://leetcode.com/problems/number-of-good-pairs/

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int len = inp.nextInt();
        System.out.println("Enter array elements : ");
        int[] nums = new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = inp.nextInt();
        }
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j])
                count++;
            }
        }
        System.out.println("Number of good pairs : "+count);
        
    }
}
