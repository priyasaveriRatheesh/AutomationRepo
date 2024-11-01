package assignments;

import testscript.Base;

public class Navigationpractise extends Base {
	public void navgtn()
	{
		driver.navigate().to("https://www.amazon.in");
		driver.navigate().back();
		driver.navigate().forward();
	driver.navigate().refresh();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Navigationpractise obj=new Navigationpractise();
		obj.initializeBrowser();
		obj.navgtn();

	}

}
