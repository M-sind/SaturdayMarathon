import java.util.Scanner;

public class FactorialNumber {public static void main(String []args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=scan.nextInt();
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println("factorial"+fact);
}

}


