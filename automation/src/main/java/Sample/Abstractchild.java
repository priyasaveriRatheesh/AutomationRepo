package Sample;

public class Abstractchild extends Abstractparent {
	
	public void display3()
	{
		System.out.println("non abstact child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractchild obj=new Abstractchild();
		obj.display1();
		obj.display2();
		obj.display3();
	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("abstract");
	}

}
