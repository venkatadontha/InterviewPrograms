 package StringToIntegerAndIntegerToString;

public class Integer2String {
	
	public static void main(String[] args)
	{
		int value=123;
		//Method-1
		String str=String.valueOf(value);
		System.out.println("Integer converted to String by Method1 is: " + str);
		//Method-2
		String str1=Integer.toString(value);
		System.out.println("Integer converted to String by Method2 is: " + str1);
	}

}
