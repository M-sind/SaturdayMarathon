import java.util.Scanner;
public class Main {
	public static void getProduct(String productCode)
	{
		switch(productCode)
		{
		case "p01":System.out.println("coco cola");
		break;
		case "p02":System.out.println("sprite");
		break;
		case "p03":System.out.println("maaza");
		break;
		default:
			System.out.println("...................");		
		}
		
	
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter product code");
		String productCode=scan.next();
		getProduct(productCode);
		
	}

}
