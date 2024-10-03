package Sample;

public class Aggregationchild {
	String place;
	int date;
	Aggregationparent ref;
	
	public void display3(String place,int date,Aggregationparent ref)
	{
		this.place=place;
		this.date=date;
		this.ref=ref;
	}
	
	public void display4()
	{
		System.out.println(place+ " "+date);
		System.out.println(ref.name+" "+ref.age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregationchild obj1=new Aggregationchild();
		Aggregationparent obj=new Aggregationparent();
		obj.display1("priya", 20);
		obj1.display3("knpy", 10/10/2010, obj);
		obj1.display4();
		
	}

}
