package CountWordsInAString;


public class CountNoOfWordsInAString2_TraverseString {
	
	public static void main(String[] args)
	{
		String str="My name is venkata raja kishore dontha";
		System.out.println(str.split("").length);
		System.out.println(str.split("\\s+").length);
	}

}
