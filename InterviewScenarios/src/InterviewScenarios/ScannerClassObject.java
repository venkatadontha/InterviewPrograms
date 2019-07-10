package InterviewScenarios;

import java.util.Scanner;

//Scanner class is used to read data into your program from keyboard

public class ScannerClassObject {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		//This code is to get only the first word in a string
		/*Scanner keyboard = new Scanner(System.in);
		System.out.println("What is ur First Name: ");
		String FirstName=keyboard.next();
		System.out.println("Hi Your First Name is: " + FirstName);*/
		
		Scanner keyboard = new Scanner(System.in);
		//This code is to get all the words from the string
		System.out.println("What is ur Full Name: ");
		String FullName=keyboard.nextLine();
		System.out.println("Hi Your Full Name is: " + FullName);
		
		//This code is to get integer value
		System.out.println("How old are you: ");
		int age=keyboard.nextInt();
		System.out.println(FullName + " You are " + age + " Years Old");
		
		//This code is to get double value
		System.out.println("Whats your salary: ");
		double salary=keyboard.nextDouble();
		System.out.println(FullName + " Your Salary is £" + salary);
		
		////This code is to get the particular charecter of a string
		System.out.println("Whats your Favourite charecter");
		char Favourite=keyboard.next().charAt(5); // Here charat(5) means 6th char of that string
		System.out.println(FullName + " Your Favourite Charecter is " + Favourite);
		
		//This code is to Converting Double to Int
		System.out.println("Enter the Amount in Double format ex: 12:34");
		double amount = keyboard.nextDouble();
		System.out.println(FullName + " Your total amount is " + amount);
		//This code is to retrieve the int value and the double value seperately by pounds and pence
		int remainingAmount = (int)(amount * 100);
		int pounds = remainingAmount/100;
		int Pence = remainingAmount % 100;
		System.out.println(FullName + " Remaining amount in dollars is " + pounds);
		System.out.println(FullName + " Remaining amount in Pence " + Pence);
		//This code to divide the  double converted int value to int and double values seperately
		int nickles = remainingAmount/5;
		int remainingNickles = remainingAmount%5;
		System.out.println("Remaining amount in nickels is " + nickles);
		System.out.println("Remaining amount in nickels is " + remainingNickles);
		
		
	}
	
}
