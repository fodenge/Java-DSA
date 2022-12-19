import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        // Java Program Vowel Or Consonant

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter any alphabet : ");
        char letter = inp.next().charAt(0);

        if(letter == 'a' || letter=='e' || letter=='i' || letter=='o' || letter == 'u' || 
        letter == 'A' || letter=='E' || letter=='I' || letter=='O' || letter == 'U' ){
            System.out.println("A vowel");
        }
        else{
            System.out.println("A consonant");
        }

    }
}
