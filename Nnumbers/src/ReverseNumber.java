
public class ReverseNumber {
	public int FindReverse(int n)
	{
		int rev=0;
		int originalNumber=n;
		while(n!=0)
		{
			 int rem=n%10;
			 rev=rev*10+rem;
			 n=n/10;
		}
		return(rev);
	}
			
			
			

}
