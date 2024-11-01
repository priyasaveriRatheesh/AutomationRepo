package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Checkbox extends Base{
	public void click()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement clickcheckbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		clickcheckbox.click();
	}
	public void isselected()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement selectcheckbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		selectcheckbox.click();
		boolean selectvariable=selectcheckbox.isSelected();
		System.out.println(selectvariable);
			}
	
	public void isenabled()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement enablecheckbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		//enablecheckbox.click();
		boolean enablevariable=enablecheckbox.isEnabled();
		System.out.println(enablevariable);
		
	}
	public void isdisplayed()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement displaycheckbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		displaycheckbox.click();
		boolean displayvariable=displaycheckbox.isDisplayed();
		System.out.println(displayvariable);
	}
		
	public void homework2()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement clickcheckbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		//clickcheckbox.click();
		boolean clickvariable=clickcheckbox.isSelected();
		System.out.println(clickvariable);
		if(clickvariable==true)
		{
			clickcheckbox.click();
			System.out.println("deselected now");
		}
		else
		{
			clickcheckbox.click();
            System.out.println("selecd now");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checkbox checkboxobj=new Checkbox();
		checkboxobj.initializeBrowser();
		//checkboxobj.click();
	    //checkboxobj.isselected();
		checkboxobj.isenabled();
		//checkboxobj.isdisplayed();
		//checkboxobj.homework2();
		//checkboxobj.driverQuitandClose();
	}

}
