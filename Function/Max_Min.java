package Function;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        
        // Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter 3 numbers : ");
        int num1 = inp.nextInt();
        int num2 = inp.nextInt();
        int num3 = inp.nextInt();
        int max= Maximum(num1, num2, num3);
        int min= Minimum(num1, num2, num3);
        System.out.println("Maximum = "+max+"   Minimum = "+min);


    }
    static int Maximum(int a, int b,int c){
        int max=0;
        if(a>b && a>c){                   
               max=a;
        }
        else if(b>a && b>c){
               max=b;
         } 
        else max=c;
        return max;
    }
    static int Minimum(int a, int b, int c){
        int min=0;
        if(a<b && a<c){
               min=a;
        }
        else if(b<a && b<c){
              min=b;
        }
        else min=c;
        return min;
    }
    
}
