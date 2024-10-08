package Sample;

import java.util.ArrayList;

public class Collectionadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> obj = new ArrayList<String>();
	{
		obj.add("hi");
	}
	ArrayList<String> obj1 = new ArrayList<String>();

	{	
		obj1.add("welcome");

	}
obj.addAll(obj1);
System.out.println(obj);
}
}