package StringReverse;

public class FinalReverseWithoutUsingStringMethods1 {
	
	//In this method, we are initializing a string variable called str 
	//with the value of your given string. Then, we are converting that 
	//string into character array with toCharArray() function. 
	//Thereafter, we are using for loop to iterate between each character 
	//in reverse order and printing each character.
	
    public static void main(String[] args) {
        String str = "Kousalya Jampana";
        char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
        for(int i= chars.length-1; i>=0; i--) {
            System.out.print(chars[i]);
        }
    }
}

 
