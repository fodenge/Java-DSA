package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Sum {
    public static void main(String[] args) {
        
        // https://leetcode.com/problems/running-sum-of-1d-array/

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter length : ");
        int len = inp.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter array : ");
        for (int i = 0; i < len; i++) {
            arr[i] = inp.nextInt();
        }
        int[] sum = new int[len];
        sum[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum[i]= sum[i-1]+ arr[i];
        }
        System.out.println("Sum array : ");
        System.out.println(Arrays.toString(sum));
    }
}
