package Sample;

public class Intefacechild implements Interfaceparent,Intefaceparent2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Intefacechild obj=new Intefacechild();
		
		obj.display();

		obj.add(10, 20);
			}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		int sum=a+b;
	System.out.println(sum);	
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("sum is");
	}

}
