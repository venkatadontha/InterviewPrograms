package InterviewScenarios;

public class Fibonacci 
{	
	public static void main(String[] args0)
	{
		int max=10;	
		int n1=0;
		int n2=1;
		for(int i=1; i<=max; i++)
		{
			System.out.print(n1 + " ");
			int sum = n1 + n2;
			n1=n2;
			n2=sum;
		}
	}
}
