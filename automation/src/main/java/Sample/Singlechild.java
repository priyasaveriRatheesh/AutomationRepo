package Sample;

public class Singlechild  extends singleinheritanceparent{
	
	public static void display2()
	{
		
		int diff=a-b;
		System.out.println("difference is " +diff);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singlechild.display2();
		singleinheritanceparent.display();
	}

}
