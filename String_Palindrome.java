import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {

        // To find out whether the given String is Palindrome or not.

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = inp.next();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("Reverse string : " + rev);

        if (str.equals(rev)) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}
