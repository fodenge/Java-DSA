package Array;

import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        
        // https://leetcode.com/problems/matrix-diagonal-sum/

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter m : ");
        int m = inp.nextInt();
        System.out.println("Enter n : ");
        int n = inp.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = inp.nextInt();
            }
        }
        int ans = matrixDiagonalSum(mat);
        System.out.println("Sum of diagonals = "+ans);
    }
    public static int matrixDiagonalSum(int[][] mat){
        int sum=0,flag=0;

        // for (int i = 0; i< mat.length ; i++) {
            for (int i = 0,j = 0,k = mat[i].length-1; i < mat.length;i++, j++,k--) {
                if(i == j && k!=j){
                    sum += mat[i][j]+mat[i][k];
                }
                if( j==k && flag==0){
                    sum += mat[i][j];
                    flag=1;
                }
            }
        // }
        return sum;
        
    }
}
