package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Webelmt extends Base{
	public void id()
	
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement name=driver.findElement(By.id("single-input-field"));
		name.sendKeys("priya");
		WebElement enter=driver.findElement(By.id("button-one"));
		enter.click();
				
	}
	public void name()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement name=driver.findElement(By.name("description"));
		name.sendKeys("priya");
		WebElement enter=driver.findElement(By.id("button-one"));
		enter.click();
	}
	public void classname()
	{
		
		WebElement clname=driver.findElement(By.className(" btn btn-primary"));

	}
	public void linktext ()
	{
		driver.navigate().to("https:selenium.qabible.in/simple-form-demo.php");
		WebElement link=driver.findElement(By.linkText("select-input.php"));
		link.click();

	}
	public void partial()
	{
		WebElement link=driver.findElement(By.linkText("select-in"));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Webelmt obj=new Webelmt();
		obj.initializeBrowser();
		//obj.id();
		//obj.classname();
		obj.linktext();
		//obj.partial();
	}

}
