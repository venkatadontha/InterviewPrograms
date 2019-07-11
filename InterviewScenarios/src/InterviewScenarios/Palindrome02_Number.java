package InterviewScenarios;

public class Palindrome02_Number {
	
	public static void isPalindrome(int num)
	{
		System.out.println("Given number is : " + num);
		int rem=0;
		int sum=0;
		int temp;
		
		temp=num;
		
		while (num > 0)
		{
			rem = num%10;
			sum = (sum*10)+rem;
			num = num/10;
		}
		
		if (temp==sum)
		{
			System.out.println("is Palindrome number");
		}
		else
		{
				System.out.println("is not Palindrome number");
		}
	}
	
	public static void main(String[] args)
	{
		isPalindrome(151);
		isPalindrome(12321);
		isPalindrome(123454321);
		isPalindrome(1234567890);
	}

}
