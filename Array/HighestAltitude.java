package Array;

import java.util.Arrays;
import java.util.Scanner;

public class HighestAltitude {
    public static void main(String[] args) {
        
        // https://leetcode.com/problems/find-the-highest-altitude/

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int len = inp.nextInt();
        System.out.println("Enter net gain : ");
        int[] gain = new int[len];
        for (int i = 0; i < gain.length; i++) {
            gain[i] = inp.nextInt();
        }

        int highest = highestAltitude(gain, len);
        System.out.println("Highest : "+highest);
    }
    public static int highestAltitude(int[] gain,int length){
        int[] altitude = new int[length+1];
        altitude[0]=0;
        for (int i = 1; i < altitude.length; i++) {
            altitude[i]=altitude[i-1]+gain[i-1];
        }
        int max = altitude[0];
        for (int i = 1; i < altitude.length; i++) {
            if(altitude[i]> max){
                max = altitude[i];
            }
        }
        return max;
    }

}
