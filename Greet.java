import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        System.out.println("Enter your name : ");
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        System.out.println("Hi "+ name + ",\n" + "Welcome to the world of Java");
    }
}
