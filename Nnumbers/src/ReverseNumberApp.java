import java.util.Scanner;
public class ReverseNumberApp {
	public static void main(String []args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");
	int n=scan.nextInt();
	ReverseNumber reverse=new ReverseNumber();
	reverse.FindReverse(n);
	System.out.println("entered number"+n+"is"+rev);
	
	}
}
