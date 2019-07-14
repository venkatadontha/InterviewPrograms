package RemoveSpacesInAString;

public class RemoveSpacesInAString_Method2 {
	
	public static void main(String[] args)
	{
		String Str ="My Name Is Venkata Raja Kishore Dontha";
		char[] chars=Str.toCharArray();
		String Str1="";
		
		for (int i=0; i<chars.length; i++)
		{
			if(chars[i]!=' ')
			{
				Str1=Str1+Str.charAt(i);
			}
		}
		System.out.println(Str1);
	}
}
