package Sample;

public class Multiplechild extends Multisecndparent {
	
	
		public void diff()
		{
			System.out.println("i am the child");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Multiplechild obj=new Multiplechild();
			obj.diff();
			obj.add();
			obj.sub();
		}
		
		

	}

