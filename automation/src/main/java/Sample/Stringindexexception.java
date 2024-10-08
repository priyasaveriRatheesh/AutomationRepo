package Sample;

class Stringindexexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hi";
		try
		{
		String l=s.substring(1,3);
		System.out.println(l);
		
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}

	}

}
