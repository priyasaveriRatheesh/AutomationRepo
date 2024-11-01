package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Demosite extends Base{
	public void demo()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message=driver.findElement(By.xpath("//input[@id='single-input-field'] "));
		message.sendKeys("priya");
		WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessage.click();
		WebElement valofA=driver.findElement(By.xpath("//input[@id='value-a']"));
		valofA.sendKeys("10");
		WebElement valofB=driver.findElement(By.xpath("//input[@id='value-b']"));
		valofB.sendKeys("20");
		WebElement gettotal=driver.findElement(By.xpath("//button[@id='button-two']"));
		gettotal.click();
			
	}
	
	public static void main(String[] args) {
		Demosite demositeobj=new Demosite();
		demositeobj.initializeBrowser();
		demositeobj.demo();
		//demositeobj.driverQuitandClose();

	}

}
