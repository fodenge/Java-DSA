package Array;

import java.util.Arrays;
import java.util.Scanner;

public class HighestCandies {
    public static void main(String[] args) {
        
        // https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number of kids : ");
        int kids = inp.nextInt();
        System.out.print("Enter number of candies kids have : ");
        int[] candies = new int[kids];
        for (int i = 0; i < candies.length; i++) {
            candies[i] = inp.nextInt();
        }
        System.out.print("Enter extra candies : ");
        int extracandies = inp.nextInt();

        //Maximum candies
        int max=candies[0];
        for (int i = 0; i < candies.length; i++) {
            if(max<candies[i])
                max=candies[i];
        }

        boolean[] result = new boolean[5];
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]+extracandies >= max){
                result[i]=true;
            }
        }

        System.out.println(Arrays.toString(result));


    }
}
