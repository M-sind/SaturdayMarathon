import java.util.Scanner;

public class HalfNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		Double num=scanner.nextDouble();
		System.out.printf("%.2f",HalfNumber(num));
	}
		public static double HalfNumber(double num) 
		{
			return num/2;
			
		}
		
}


