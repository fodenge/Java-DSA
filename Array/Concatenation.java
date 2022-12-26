package Array;

import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        
        // https://leetcode.com/problems/concatenation-of-array/

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int len = inp.nextInt();
        int[] nums = new int[len];
        System.out.println("Enter "+len+" elements");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = inp.nextInt();
        }

        int[] ans = new int[2*len];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i+len] = nums[i];
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }



    }
}
