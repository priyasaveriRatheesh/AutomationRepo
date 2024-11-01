package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumbase {
public	WebDriver driver;
	public void browserinitialize()
	{
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/ ");
		driver.manage().window().maximize();
		//driver.quit();
		//driver.close();
		driver.navigate().to("https://www.amazon.in/");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seleniumbase obj=new Seleniumbase ();
		obj.browserinitialize();
	}

}
