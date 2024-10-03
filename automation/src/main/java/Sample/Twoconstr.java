package Sample;

public class Twoconstr {
	String name;
	public Twoconstr()
	{
		this("priya");
		System.out.println("hello");
	}

	public Twoconstr(String name)
	{
		this.name=name;
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Twoconstr obj=new Twoconstr();
	}

}
