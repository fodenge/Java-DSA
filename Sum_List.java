import java.util.Scanner;

public class Sum_List {
    public static void main(String[] args) {
        
        // Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive 
        // odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a list of numbers : ");
        int sumE=0,sumO=0,sumN=0;
        while(true)
        {
            int num = inp.nextInt();
            if(num>0)
            {
                if(num%2 == 0)
                   sumE=sumE+num;
                else 
                {
                    sumO=sumO+num;
                }
            }
            else if(num<0){
                sumN=sumN+num;
            }
            else{
                break;
            }
        }
        System.out.println("Positive even numbers sum = "+sumE+"\nPositive odd numbers sum = "+sumO+"\nNegative numbers sum = "+sumN);

    }
}
