package testscript2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Multiplewindowhandling extends Base {
	public void multiplewindowhandling()
	{
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement contact=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contact.click();
		WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		login.click();
		String parent=driver.getWindowHandle();
		System.out.println("parent" + parent);
		System.out.println("-----------------------------------------------");
		Set<String> allwindows=driver.getWindowHandles();
		for(String temp:allwindows)
		{
			System.out.println("windows" +temp);
			driver.switchTo().window(temp);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("**************************************************************");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplewindowhandling windowobj=new Multiplewindowhandling();
		windowobj.initializeBrowser();
		windowobj.multiplewindowhandling();
		//windowobj.driverQuitandClose();
	}

}
