package SwapNumbers;

import java.util.Scanner;

public class SwapNumbersUsingTempVariable {

	public static void main(String[] args) {
		int x, y, temp;
		System.out.println("Enter x and y");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		System.out.println("Before Swapping the value of x is: " + x);
		System.out.println("Before Swapping the value of y is: " + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After Swapping the value of x is: " + x);
		System.out.println("After Swapping the value of y is: " + y);
		
	}

}
