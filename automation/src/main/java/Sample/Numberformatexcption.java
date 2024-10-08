package Sample;

public class Numberformatexcption {
	
	public static void main(String[] args) {
		String s="priya";

		
		// TODO Auto-generated method stub
try
{
	int a=Integer.parseInt(s);
	System.out.println(a);
}

catch(NumberFormatException e)
{
System.out.println(e);
}

}
}
