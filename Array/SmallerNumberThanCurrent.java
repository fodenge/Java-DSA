package Array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class SmallerNumberThanCurrent {
    public static void main(String[] args) {

        // https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
        
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int len = inp.nextInt();
        System.out.println("Enter array elements : ");
        int[] nums = new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = inp.nextInt();
        }
        int[] res = new int[len];
        for (int i = 0; i < nums.length; i++) {
            int count=0;
            for (int j = 0;j < nums.length; j++) {
                if(i != j){
                    if ( nums[i] > nums[j]){
                        count++;
                    }
                }
            }
            res[i]=count;
        }
        System.out.println("Result : "+Arrays.toString(res));




    }
}
