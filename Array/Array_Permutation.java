package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Permutation {
    public static void main(String[] args) {

        // https://leetcode.com/problems/build-array-from-permutation/
        System.out.println("Enter array elements : ");
        Scanner inp = new Scanner(System.in);
        int[] num = new int[6];
        int[] ans = new int[6];
        for (int i = 0; i < num.length; i++) {
            num[i]=inp.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            ans[i]=num[num[i]];
        }
        System.out.println(Arrays.toString(ans));

    }
}
