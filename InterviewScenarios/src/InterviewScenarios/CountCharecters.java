package InterviewScenarios;

public class CountCharecters
{
	static void count(String str)
	{
		//create an char array of given string
		char[] ch = str.toCharArray();
		for (int i=0; i<ch.length; i++)
		{
			//Declare a string with empty initialization
			String s="";
			//When the character is not a space
			while(i<ch.length && ch[i] != ' ')
			{
			s = s+ch[i];
			i++;
		}
		if (s.length() > 0)
		System.out.println(s + "->" + s.length());
	}
}

public static void main (String[] args)
{
	String str = "MY NAME IS VENKATA RAJA KISHORE DONTHA";
	count(str);
}
}