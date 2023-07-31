import java.util.Scanner;
public class Calculator {
	Scanner scan=new Scanner(System.in);
	void add()
	{
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("addition of a and b"+(a+b));
	}
	void Sub()
	{
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("addition of a and b"+(a-b));
	}
	void Mul()
	{
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("addition of a and b"+(a*b));
	}
	void Div()
	{
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("addition of a and b"+(a/b));
	}
	void rem()
	{
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("addition of a and b"+(a%b));
	}
	void Square()
	{
		int a=scan.nextInt();
		System.out.println("addition of a "+(a*a));
	}

}
