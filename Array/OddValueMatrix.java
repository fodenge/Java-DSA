package Array;

import java.util.Scanner;

public class OddValueMatrix {
    public static void main(String[] args) {
        
        // https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter m : ");
        int m = inp.nextInt();
        System.out.println("Enter n : ");
        int n = inp.nextInt();
        

        int[][] indice = {{0,1},{1,1}};
        int odd = oddCells(m,n, indice);
        System.out.println("Odd values count: "+odd);

    }
    public static int oddCells(int m, int n, int[][] indice) {
        int[][] sample = new int[m][n];
        for (int i = 0; i < indice.length; i++) {
            // for (int j = 0; j < indice[i].length; j++) {
                // if(j%2==0){
                // sample[indice[i][j]][j]++;
                // }
                // if(j%2 != 0){
                //     sample[j][indice[i][j]]++;
                // }

                int row = indice[i][0];
                int col = indice[i][1];

                for (int j=0; j<n; j++) {
                    sample[row][j]++;
                }
                for (int j=0; j<m; j++) {
                    sample[j][col]++;
                }

                // }
        }

        int countOdd=0;

        for (int i=0; i<sample.length; i++) {
            for (int j = 0; j < sample[i].length; j++) {
                if(sample[i][j] % 2 != 0){
                    countOdd++;
                }
            }
        }
        return countOdd;
    }
}
