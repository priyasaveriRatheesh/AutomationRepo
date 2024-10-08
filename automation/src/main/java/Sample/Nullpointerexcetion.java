package Sample;

import java.io.PrintStream;

public class Nullpointerexcetion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		try
		{
			String s=null;
			System.out.println(s.length());
			
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
	}

}
