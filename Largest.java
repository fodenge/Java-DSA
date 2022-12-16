import java.util.Scanner;

public class Largest{
public static void main(String[] args) {
    // Take 2 numbers as input and print the largest number.
    
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter first number : ");
    int num1=inp.nextInt();
    System.out.println("Enter second number : ");
    int num2=inp.nextInt();
    int large=0;
    if(num1>num2)
      large=num1;
    else large=num2;
    System.out.println("Largest number is : "+large);
    
}
    
    
}
