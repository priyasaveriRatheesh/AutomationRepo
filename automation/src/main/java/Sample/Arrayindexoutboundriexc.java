package Sample;

public class Arrayindexoutboundriexc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[]=new int[2];
array[0]=10;
array[1]=20;
try
{
	array[2]=30;
	for(int i=0;i<=array.length;i++)
		System.out.println(array[i]);
}
catch(ArrayIndexOutOfBoundsException e)

{
	System.out.println(e);
}

	}

}
