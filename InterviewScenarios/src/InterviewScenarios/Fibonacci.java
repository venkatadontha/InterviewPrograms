package InterviewScenarios;

import java.util.Scanner;

public class Fibonacci 
{	
	public static void main(String[] args0)
	{
		int num;	
		int n1=0;
		int n2=1;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of times");
		num = in.nextInt();

		for(int i=1; i<=num; i++)
		{
			System.out.print(n1 + " ");
			int sum = n1 + n2;
			n1=n2;
			n2=sum;
		}
	}
}
