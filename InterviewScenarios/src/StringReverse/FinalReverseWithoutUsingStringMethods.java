package StringReverse;

public class FinalReverseWithoutUsingStringMethods 
{
	public static void ReverseString(String Name) 
	{
		System.out.println("Enter the String to Reverse : " + Name);
        StringBuilder ReverseName = new StringBuilder();
        ReverseName.append(Name);
        ReverseName = ReverseName.reverse();     // used string builder to reverse
        System.out.println(ReverseName);
     }
	
	public static void main(String[] args)
	{
		ReverseString("RajaKishore");
		ReverseString("Kousalya");
		ReverseString("Vivaan");
		ReverseString("Venkata Raja Kishore Dontha");
	}

}
 
