package Sample;

public class Arithameticexceptionsecndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=11;
int b=17;
int c;
try
{
	c=a/b;
	System.out.println(c);
}
catch(ArithmeticException e)
{
	System.out.println(e);
}
finally
{
	System.out.println("compulsory statements");
}
		
	}

}
