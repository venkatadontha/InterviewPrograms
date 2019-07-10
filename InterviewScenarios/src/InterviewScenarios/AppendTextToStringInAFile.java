package InterviewScenarios;

import java.io.*;

public class AppendTextToStringInAFile {
	
	public static void write(String s, File f) throws IOException
	{
		FileWriter fw = new FileWriter(f, true);
		fw.write(s);
		fw.close();
	}
	public static void main(String[] args)
	{
		try{
			File f = new File("C:\\Users\\Vivaan\\Desktop\\AppendText.txt");
			write("This text has been appended", f);
		}
		catch(IOException e)
		{
		}
	}

}
