
import java.util.Scanner;
public class Main {
	public static void checkMultipleOfTen(int n) 
	{  
		if(n%10==0)
		{
			System.out.println("given number is multiple of ten");
		}
		else
		{
			System.out.println("given number is not amultiple of 10");
		
	}
	}
		public static void main(String[] args) 
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("enter n value");
			int n=scan.nextInt();
			checkMultipleOfTen(n);
}


}
