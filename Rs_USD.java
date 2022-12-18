import java.util.Scanner;

public class Rs_USD {
    public static void main(String[] args) {
        
        // Input currency in rupees and output in USD.

        Scanner inp= new Scanner(System.in);
        System.out.println("Enter in Rupees : ");
        double rs = inp.nextDouble();
        double usd = rs / 82;  // Takind 1 USD = 82 Rupees
        System.out.printf(rs + " Rupees = "+ String.format("%.2f",usd)+" USD");  // Decimal value upto 2 digit precision : %.2f 
    }
    
}
