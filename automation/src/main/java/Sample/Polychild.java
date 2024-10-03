package Sample;

public class Polychild extends polypara {
	public void  display()
	{
		super.display();
		System.out.println(" welcom");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polychild obj=new Polychild();
		obj.display();
	}

}
