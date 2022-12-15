import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner inp=new Scanner(System.in);
        int num = inp.nextInt();
        if(num %2 ==0 )
           System.out.println(num+ " is an even number");
        else
           System.out.println(num+" is an odd number");
    }
}
