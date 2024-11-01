package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Multiwindow  extends Base{

	public void multiwindow()
	{
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement element1=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		element1.click();
		WebElement element2=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		element2.click();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child=driver.getWindowHandles();
		for(String i:child)
		{
			System.out.println(i);
			driver.switchTo().window(i);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiwindow obj=new Multiwindow();
		obj.initializeBrowser();
		obj.multiwindow();
		//obj.driverQuitandClose();
	}

}
