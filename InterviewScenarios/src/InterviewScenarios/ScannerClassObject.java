package InterviewScenarios;

import java.util.Scanner;

//Scanner class is used to read data into your program from keyboard

public class ScannerClassObject {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		/*Scanner keyboard = new Scanner(System.in);
		System.out.println("What is ur First Name: ");
		String FirstName=keyboard.next();
		System.out.println("Hi Your First Name is: " + FirstName);*/
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is ur Full Name: ");
		String FullName=keyboard.nextLine();
		System.out.println("Hi Your Full Name is: " + FullName);
		
		System.out.println("How old are you: ");
		int age=keyboard.nextInt();
		System.out.println(FullName + " You are " + age + " Years Old");
		
		System.out.println("Whats your salary: ");
		double salary=keyboard.nextDouble();
		System.out.println(FullName + " Your Salary is £" + salary);
		
		System.out.println("Whats your Favourite charecter");
		char Favourite=keyboard.next().charAt(5); // Here charat(5) means 6th char of that string
		System.out.println(FullName + " Your Favourite Charecter is " + Favourite);
		
		//Converting Double to Int
		System.out.println("Enter the Amount in Double format ex: 12:34");
		double amount = keyboard.nextDouble();
		int remainingAmount = (int)(amount * 100);
		int dollars = remainingAmount/100;
		int Pence = remainingAmount % 100;
		System.out.println("Remaining amount in Pence " + Pence);
		System.out.println("Remaining amount in dollars is " + dollars);
		int nickles = remainingAmount/5;
		remainingAmount = remainingAmount%5;
		System.out.println("Remaining amount in nickels is " + nickles);
	
		
		
	}
	
}
