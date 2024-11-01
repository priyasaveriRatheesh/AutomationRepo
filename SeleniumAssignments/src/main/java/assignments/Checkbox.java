package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Checkbox extends Base {
	public void click()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement check=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		check.click();
		check.click();
	}
	public void isselected()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement check=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		check.click();
		check.click();
          boolean variable=check.isSelected();
          System.out.println(variable);

	}
	public void isenabled()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement male=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		male.click();
          boolean variable=male.isEnabled();
          System.out.println(variable);

	}
	public void isdisplayed()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement male=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		male.click();
          boolean variable=male.isDisplayed();
          System.out.println(variable);

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checkbox obj=new Checkbox();
		obj.initializeBrowser();
		//obj.click();
		//obj.isselected();
		//obj.isdisplayed();
		obj.isenabled();
	}

}
