package Function;

import java.util.Scanner;

public class F_Vote {
    public static void main(String[] args) {
        
        // A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = inp.nextInt();
        boolean eligible =eligibility(age);
        if(eligible)
          System.out.println("Eligible");
        else System.out.println("Ineligible");
    }
    static boolean eligibility(int age){
        if(age>= 18 )
           return true;
        else return false;
    }
}
