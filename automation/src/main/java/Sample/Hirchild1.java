package Sample;

public class Hirchild1  extends Hirparent {
public void display2()
{
	super.add("priya", 34);
	super.display();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hirchild1 obj=new Hirchild1();
		obj.display2();
	
	}

}
