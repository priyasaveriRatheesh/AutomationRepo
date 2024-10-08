package Sample;

public class Arithemeticexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		int c;
		try 
		{
		c=a/b;
					System.out.println(c);
				}
	
catch(ArithmeticException e)
{
System.out.println("overcome"  +e);
}
}
}
