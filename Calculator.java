import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter first element : ");
        double num1=inp.nextDouble();
        System.out.println("Enter second element : ");
        double num2=inp.nextDouble();
        System.out.println("Enter operand ");
        char op=inp.next().charAt(0);
        double res=0;
        if(op == '+')
           res=num1+num2;
        if(op == '-')
           res=num1-num2;
        if(op == '*')
           res=num1*num2;
        if(op == '/')
           res=num1/num2;
        System.out.println("Answer = "+res);
        


    }
}
