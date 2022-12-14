import java.util.Scanner;

public class LCM_HCF {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        int num1=inp.nextInt();
        int num2=inp.nextInt();
        int hcf=1;
        for(int i=1;i<num1;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                hcf=i;
            }
        }
        int lcm=(num1*num2)/hcf;
        System.out.println("HCF = "+hcf+" and LCM = "+lcm);
    }
    
}
