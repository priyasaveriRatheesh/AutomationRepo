package Sample;

public class singleinheritancechildparamerise extends singleinheritanceparentnonpara {
	public void diff(int a,int b)
	{
		int diff=a-b;
		System.out.println(diff);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singleinheritancechildparamerise obj=new singleinheritancechildparamerise();
		obj.add(10,5);
		obj.diff(10, 5);
	}

}
