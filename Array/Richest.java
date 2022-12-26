package Array;

import java.util.Scanner;

public class Richest {
    public static void main(String[] args) {

        // https://leetcode.com/problems/richest-customer-wealth/

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number of customers : ");
        int cust = inp.nextInt();
        System.out.println("Number of banks : ");
        int banks = inp.nextInt();
        int[][] accounts = new int[cust][banks];
        System.out.println("Enter account elements : ");
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                accounts[i][j] = inp.nextInt();
            }
        }
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            if (sum > max)
                max = sum;
        }
        System.out.println("Richest : "+max);

    }
}
