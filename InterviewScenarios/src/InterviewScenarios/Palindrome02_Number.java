package InterviewScenarios;

import java.util.Scanner;

public class Palindrome02_Number {
	
	public static void main(String[] args)
	{
		int rem, rev=0;
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		int temp=number;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if (rev==number)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}