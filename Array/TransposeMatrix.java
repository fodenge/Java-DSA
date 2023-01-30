package Array;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        
        // https://leetcode.com/problems/transpose-matrix/

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter m :");
        int m = inp.nextInt();
        System.out.println("Enter n :");
        int n = inp.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = inp.nextInt();
            }
        }
        int[][] transpose = new int[n][n];
        transpose = transpose(matrix,m,n);
        System.out.println("Transposed Matrix :");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] );
            }
            System.out.println("\n");
        }
    }

    public static int[][] transpose(int[][] matrix,int m,int n) {
        int[][] transpose = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }
}
