import java.util.Scanner;
public class Leap
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner inpu = new Scanner(System.in);
		int year=inpu.nextInt();
		if(year%100==0)
		  System.out.println("Century");
		if(year%400==0 )
		  System.out.println("Leap");
		else System.out.println("Non leap");
	}
}