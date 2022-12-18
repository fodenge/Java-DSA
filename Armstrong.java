import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        // To find Armstrong Number between two given number

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the range for Armstrong Number : ");
        int low = inp.nextInt();
        int high = inp.nextInt();
        int original,count;

        //Range[low,high] 
        for(int i=low; i <= high; i++)
        {
            //find number of digits
            original=i;
            count=0;
            while(original>0)
            {
                original=original/10;
                count++;
            }

            //Armstrong number
            int num=i;
            double sum=0,rem=0;
            while(num>0)
            {
                rem=num%10;
                sum=sum + Math.pow(rem,count);
                num=num/10;
            }

            if((int)sum == i)
               System.out.println(i+"  ");

        }
    }
}
