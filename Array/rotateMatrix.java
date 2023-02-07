package Array;

import java.util.Scanner;

public class rotateMatrix {
    public static void main(String[] args) {
        
        // https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = inp.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = inp.nextInt();
            }
        }
        int[][] target = new int[n][n];
        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target.length; j++) {
                target[i][j] = inp.nextInt();
            }
        }
        boolean ans = findRotation(mat, target);
        System.out.println(ans);

    }
    public static boolean findRotation(int[][] mat,int[][] target) {
      for (int i = 0; i < 4; i++) {
        if(isEqual(mat,target)) return true;
        mat = rotate(mat);
      }
      return false; 
    }
    
    public static int[][] rotate(int[][] mat) {
        int n = mat.length;
        //transposing the matrix
        int[][] transpose = new int[n][n];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                transpose[i][j] = mat[j][i];
            }
        }

        //changing rows
        for (int col1 = 0,col2=n-1; col1 < n/2; col1++,col2--) {
            for (int row = 0; row < n ; row++) {
                int temp = transpose[row][col1];
                transpose[row][col1] = transpose[row][col2];
                transpose[row][col2] = temp;
            }
        }
        return transpose;
    }

    public static boolean isEqual(int[][] mat, int[][] target) {
        if(mat.length != target.length) return false;
        if(mat[0].length != target[0].length) return false;
        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target.length; j++) {
                if(mat[i][j] != target[i][j] ) return false;
            }
        }
        return true;
    }
}
