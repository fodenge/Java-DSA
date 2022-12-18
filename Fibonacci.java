import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // To calculate Fibonacci Series up to n numbers.

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number upto which Fibonacci series is to be calculated : ");
        int num = inp.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a+" , "+b+" , ");
        while(num != 2 )     // First two numbers are already printed
        {
            int temp = b;
            b = b+a;
            a = temp;
            System.out.print(b+" ,");
            num--;
        }
    }
}
