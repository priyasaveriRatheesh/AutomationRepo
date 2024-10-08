package Sample;

public class Interfacechildex implements Interfaceparentex1,Intefaceparentexmple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfacechildex obj=new Interfacechildex();
		obj.display();
		obj.display2();
	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("welcome");
	}

}
