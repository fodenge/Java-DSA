package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxPopulation {
    public static void main(String[] args) {
        
        // https://leetcode.com/problems/maximum-population-year/description/

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter r : ");
        int row = inp.nextInt();
        System.out.println("Enter c : ");
        int col = inp.nextInt();
        int[][] logs = new int[row][col];
        System.out.println("Enter logs : ");
        for (int i = 0; i < logs.length; i++) {
            for (int j = 0; j < logs[i].length; j++) {
                logs[i][j] = inp.nextInt();
            }
        }
        int max = maximumPopulation(logs);
        System.out.println("Maximum population : " + max);

    }
    public static int maximumPopulation(int[][] logs) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < logs.length; i++) {
            int birth = logs[i][0];
            int death = logs[i][1];
            int count = 1;
            int max = 1;
            for (int j = i+1; j < logs.length; j++) {
                if(logs[j][0] < death){
                    count++;
                }
            }
            if(max < count){
                max = count;
                list.clear();
                list.add(logs[i][0]);
            }
            else if(max == count){
                list.add(logs[i][0]);
            }
            
        }

        return list.get(0);
        
    }
}
