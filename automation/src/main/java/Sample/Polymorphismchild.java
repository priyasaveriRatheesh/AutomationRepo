package Sample;

public class Polymorphismchild  extends Polymorphismoverridingparent
{

	public void display()
	{
		
		super.display();
		System.out.println(" this is child");
			}
	

public static void main(String[] args) {
		// TODO Auto-generated method stub

	Polymorphismchild obj=new Polymorphismchild();
	obj.display();
		
	}

}
