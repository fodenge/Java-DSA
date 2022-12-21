package Function;

import java.util.Scanner;

public class F_Even_Odd {
    public static void main(String[] args) {
        
        // Define a program to find out whether a given number is even or odd.

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = inp.nextInt();
        even_odd(num);
        
    }
    static void even_odd(int number){
        if(number%2 == 0){
            System.out.println("Even number");
        }
        else System.out.println("Odd Number");
    }
}
