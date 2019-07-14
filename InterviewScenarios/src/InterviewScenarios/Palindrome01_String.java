package InterviewScenarios;

import java.util.Scanner;

public class Palindrome01_String {
	
	public static void main(String[] args)
	{
		String reverse="";
		System.out.println("Enter the Input Text / String :");
		Scanner sc=new Scanner(System.in);
		String original=sc.nextLine();
		
		for(int i=original.length()-1; i>=0; i--)
		{
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse))
		{
			System.out.println("Given Input Text " + original + " String is Palindrome");
		}else
		{
			System.out.println("Given Input Text " + original + " String is not Palindrome");
		}
	}

}
