package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
public WebDriver driver;//web driver is an interface
	public void initializeBrowser()
	{
		
	driver=new ChromeDriver();	//loading the driver or browser initialization
	driver.get("https://selenium.qabible.in/");//method used for launch url
	driver.manage().window().maximize();//command to maximize window
	
	}
	public void driverQuitandClose() 
	
	{
	//driver.close();//to close the parent  window
	driver.quit();// closing all the opened windows
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base=new Base();
		base.initializeBrowser();
		base.driverQuitandClose();
		
	}

}
