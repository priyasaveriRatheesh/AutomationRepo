package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgebrowser {
	public WebDriver driver;
		public void Edge()
	{
		driver=new EdgeDriver();
		driver.get("https://selenium.qabible.in/");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edgebrowser obj=new Edgebrowser();
		obj.Edge();
	}

}
