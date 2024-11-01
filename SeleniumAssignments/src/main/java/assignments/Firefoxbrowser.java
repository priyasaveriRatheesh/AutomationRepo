package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxbrowser 
{
public WebDriver driver;
	public void InitializeBrowser()
	{
		driver=new FirefoxDriver();
		driver.get("https://selenium.qabible.in/");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Firefoxbrowser obj=new Firefoxbrowser();
		obj.InitializeBrowser();
	}

}
