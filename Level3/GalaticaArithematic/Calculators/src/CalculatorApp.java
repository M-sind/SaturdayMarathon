import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Calculator cal=new Calculator();
	System.out.println("hello user welcome to kodnest calculator");
	while(true)
	{
	System.out.println("+.............>Addition");
	System.out.println("-..............>Substraction");
	System.out.println("*...............>multiplication");
	System.out.println("/................>division");
	System.out.println("%.................>Modulus");
	System.out.println("^..................>Find square");
	System.out.println("select your choice");
	char ch=scan.next().charAt(0);
	switch(ch)
	{
	case '+' :cal.add();
	          break;
	case '-' :cal.Sub();
		      break;
	case '*' :cal.Mul();
              break;
	case '/' :cal.Div();
              break;
	case '%' :cal.rem();
              break;
	case '^' :cal.Square();
              break;
	case '!' :System.out.println("tata byee");
	          return;
     default: 
    	 System.out.println("buffalo");
     }
	}
	}
}
		      
	          
	
	
	

