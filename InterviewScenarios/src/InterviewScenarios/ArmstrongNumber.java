package InterviewScenarios;

public class ArmstrongNumber {
	
	public void isArmstrong(int num)
	{
		System.out.println("Entered number is " + num);
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
