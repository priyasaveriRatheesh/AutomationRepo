package Sample;

import java.io.IOException;
public class ExcelReadchild {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String y=ExcelReadparent.getStringData(1, 0);
		System.out.println(y);
		String z=ExcelReadparent.getIntegerData(1, 1);
		System.out.println(z);

	}


	

	

}
	

