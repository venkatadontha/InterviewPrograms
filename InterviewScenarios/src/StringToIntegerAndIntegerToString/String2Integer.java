package StringToIntegerAndIntegerToString;

public class String2Integer {
	
	public static void main(String[] args)
	{
		String Str="123";
		//Method-1
		int Str1=Integer.parseInt(Str);
		System.out.println("String converted to Integer value by Method1: " + Str1);
		//Method-2
		int Str2=Integer.valueOf(Str);
		System.out.println("String converted to Integer value by Method2: " + Str2);
	}

}
