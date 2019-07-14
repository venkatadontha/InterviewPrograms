package InterviewScenarios;

public class ArmstrongNumber {
	
	
	// Example numbers of Armstrong are: 153, 407, 0 , 1, 370
	
	public void isArmstrong(int num)
	{
		System.out.println("Given number is " + num);
		int cube=0;
		int rem;
		int temp;
		
		temp=num;
		while (num>0)
		{
			rem = num%10;
			num = num/10;
			cube = cube+(rem*rem*rem);
		}
		
		if (temp==cube)
		{
			System.out.println("This is an Armstrong number");
		}
		else
		{
			System.out.println("This is not Armstrong number");
		}
	}

}
