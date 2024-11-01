package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Multiplewindw extends Base
{
public void parent()
{
	driver.navigate().to("https://webdriveruniversity.com/");
	WebElement contact=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
	contact.click();
	WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
	login.click();
	String single=driver.getWindowHandle();	
	System.out.println(single);
	Set<String> windows=driver.getWindowHandles();
	for(String i:windows)
	{
		System.out.println(i);
		driver.switchTo().window(i);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplewindw obj=new Multiplewindw();
		obj.initializeBrowser();
		obj.parent();
				
	}

}
