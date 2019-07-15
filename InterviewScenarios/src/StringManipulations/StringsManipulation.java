package StringManipulations;

public class StringsManipulation {
	
	public static void main(String[] args)
	{
		String str = "My Name is Venkata Raja Kishore Dontha & My Wife Name is Kousalya Jampana & My Son name is Vivaan Dontha";
		String str1 = "My Name is Venkata Raja Kishore Dontha & My Wife Name is Kousalya Jampana & My Son name is Vivaan Dontha";
		String str2 = "My Name is VENKATA RAJA KISHORE DONTHA & My Wife Name is Kousalya Jampana & My Son name is Vivaan Dontha";
		String str3 = "    My Name is Venkata Raja Kishore Dontha   ";
		
		//Method to find the length of the string
		System.out.println("Length of the String is : " + str.length());
		
		//Method to find which character is at 11th location
		System.out.println("Charater at the 10th location is: " + str.charAt(11));
		
		//Method to find which character is at 10th location - There is a space here
		System.out.println("Charater at the 10th location is: " + str.charAt(10));
		
		//Method to find the first location of Character N in the string
		System.out.println("Index of 1st N in the string is : " + str.indexOf("n"));
		//Method to find the second location of Character N in the string
		System.out.println("Index of 2nd N in the string is : " + (str.indexOf('n',str.indexOf('n')+1)));
		//Method to find the third location of Character N in the string
		System.out.println("Index of 34d N in the string is : " + (str.indexOf('n',str.indexOf('n', str.indexOf('n')+1)+2)));
        //Method to find the index of a word 'Wife'
		System.out.println("Index of Wife in the string is : " + str.indexOf("Wife"));
		//Method to find the index of a word 'Sarvani' which is not defined in the string
		System.out.println("Index of Wife in the string is : " + str.indexOf("Sarvani"));
		
		//Method to compare 2 strings if both are same
		System.out.println(str.equals(str1));
		//Method to compare 2 string if both are different
		System.out.println(str.equals(str2));
		//Method to compare 2 string ignoring the capital and small letters
		System.out.println(str.equalsIgnoreCase(str2));
		
		//Method to fetch the string between specified string values
		System.out.println(str.substring(11, 38));
		
		//Method to Trim the string
		System.out.println(str3.trim());
		
		//Method to replace
		System.out.println(str3.replace(" ", ""));
		
		//Method to split
		String str4="This_Is_My_Split_Scneario";
		String str4val[]=str4.split("_");
		for(int i=0; i<str4val.length; i++)
		{
			System.out.print(str4val[i]);
			System.out.println(str4val[i]);
		}
		
		//Method to concatenate 2 strings
		String str5 = " Sample info";
		System.out.println(str.concat(str5));
		
		//Another important Method
		String x="Hello";
		String y="World";
		int a=10;
		int b=20;
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y);
		
	}

}
