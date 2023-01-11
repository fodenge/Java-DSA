package Array;


import java.util.Arrays;
import java.util.Scanner;

public class FlippingImage {
    
    public static void main(String[] args) {
        
        // https://leetcode.com/problems/flipping-an-image/

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = inp.nextInt();
        System.out.println("Enter matrix : ");
        int[][] image = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               image[i][j] = inp.nextInt(); 
            }
        }

        int[][] reverse = reverse(image,n);
        invert(reverse);
        for (int i = 0; i < reverse.length; i++) {
            System.out.println(Arrays.toString(reverse[i]));
        }
    }

    public static int[][] reverse(int[][] image,int n){
        int[][] rev = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = n-1,k=0; j >= 0 && k<n; j--,k++) {
                rev[i][k]=image[i][j];
            }
        }
        return rev;
    }
    public static void invert(int[][] reverse){
        for (int i = 0; i < reverse.length; i++) {
            for (int j = 0; j < reverse.length; j++) {
                if(reverse[i][j] == 0){
                    reverse[i][j]=1;
                }
                else{
                    reverse[i][j]=0;
                }
            }
        }
    }
}
