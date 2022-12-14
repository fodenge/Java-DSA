import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // System.out.println("Enter number : ");
        Scanner inp = new Scanner(System.in);
        int num;
        System.out.println("Enter number to quit : ");
        int q = inp.nextInt();
        int sum = 0;
        while (true) {
            num = inp.nextInt();
            if (num != q)
                sum = sum + num;
            else {
                sum = sum + num;
                break;
            }
        }
        System.out.println("SUM = " + sum);

    }

}
