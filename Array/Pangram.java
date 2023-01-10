package Array;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
    // https://leetcode.com/problems/check-if-the-sentence-is-pangram/

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter sttring : ");
        String str = inp.nextLine();
        boolean ans = pangram(str);
        if(ans == true){
            System.out.println("Pangram");
        }
        else{
            System.out.println("Not pangram");
        }
        
    }
    public static boolean pangram(String string){
        for (int i = 0; i < 26; i++) {
            char curCurrent=(char)('a'+i);
            if(string.indexOf(curCurrent) == -1){
                return false;
            }
        }
        return true;
    }

    

}
