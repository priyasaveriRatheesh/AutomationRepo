package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	
	public void Example()
	{
		//WebElement element name=driver.findElement(By.locator("locator value"));
		WebElement element1=driver.findElement(By.id("single-input-field"));//field inspect 
		element1.sendKeys("priya");//to enter the value
		WebElement Showmessage=driver.findElement(By.id("button-one"));//button inspect&locate
		Showmessage.click();// to click
	}
	public void Id()
	
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement valueofA=driver.findElement(By.id("value-a"));
		valueofA.sendKeys("10");
		WebElement valueofB=driver.findElement(By.id("value-b"));
		valueofB.sendKeys("20");
		WebElement gettotal=driver.findElement(By.id("button-two"));
		}
	public void ClassName()
{
	WebElement element2=driver.findElement(By.className("mb-sec"));
	WebElement element3=driver.findElement(By.className("clearfix"));
	WebElement element4=driver.findElement(By.className("copyright"));
                                                        
}
 public void Name()
 {
	 WebElement element5=driver.findElement(By.name("viewport"));
	 WebElement Element6=driver.findElement(By.name("description"));
	 WebElement element7=driver.findElement(By.name("keywords"));
 }
 
 public void LinkText()
 {
	 WebElement element8=driver.findElement(By.linkText("Simple Form Demo"));
	 WebElement element9=driver.findElement(By.linkText(" Checkbox Demo"));
	 WebElement element10=driver.findElement(By.linkText(" Radio Buttons Demo"));
 }
	public void PartialLinkText()
	{
		 WebElement elementpart=driver.findElement(By.partialLinkText("Simple Form D"));
		 WebElement elementpart1=driver.findElement(By.partialLinkText("Simple Form"));
		 WebElement elementpart2=driver.findElement(By.partialLinkText("Radio Buttons D"));

	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators locatingmethods=new Locators();
		locatingmethods.initializeBrowser();
		//locatingmethods.Example();
		//locatingmethods.Id();
		//locatingmethods.ClassName();
	locatingmethods.Name();
	//	locatingmethods.LinkText();
	//	locatingmethods.PartialLinkText();
		//locatingmethods.driverQuitandClose();
	}

}
