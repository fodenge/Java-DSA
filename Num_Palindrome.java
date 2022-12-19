import java.util.Scanner;

public class Num_Palindrome {
    public static void main(String[] args) {
        // Find if a number is palindrome or not

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = inp.nextInt();
        int original=num;
        int sum=0;

        while(num>0){
            int rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        if(original == sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    
}
