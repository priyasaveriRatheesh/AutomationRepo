package Sample;

public class Singletjisparent 
{
	int a=30;
	int b=10;
	int sum;
	int diff;
	public void add(int a,int b) {
	 this.a=a;
	 this.b=b;
	}
	public void display()
		{
		 sum=a+b;
		//this.add(25, 5);
		System.out.println(sum);	
	}
	
}
