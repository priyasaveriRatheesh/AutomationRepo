package Sample;

public class singleinstancechild extends singleinstancemethdparent {
	public void display1()
	{
		int diff=a-b;
		System.out.println("diffis "  +diff);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singleinstancechild obj=new singleinstancechild();
		obj.display();
		obj.display1();
	}

}
