package Sample;

public class Instancethis {

	String name;
	int age;
	public Instancethis(String name,int age)
		{
		this.name=name;
	this.age=age;
	}
	public void display()
	
	{	System.out.println(name+"  "+age);
	}

	public static void main(String[] args) 
	{
	
		Instancethis obj=new Instancethis("saveri",8);
		obj.display();
	}

}
