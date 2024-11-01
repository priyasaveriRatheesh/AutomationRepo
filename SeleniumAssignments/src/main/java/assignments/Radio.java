package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Radio  extends Base{

	public void click()
	{
		driver.navigate().to(" https://selenium.qabible.in/radio-button-demo.php");
		WebElement male=driver.findElement(By.xpath("//input[@id='inlineRadio1'] "));
		male.click();
	}
	public void isselected()
	{
		driver.navigate().to(" https://selenium.qabible.in/radio-button-demo.php");
		WebElement male=driver.findElement(By.xpath("//input[@id='inlineRadio1'] "));
		male.click();
          boolean variable=male.isSelected();
          System.out.println(variable);

	}
	public void isenabled()
	{
		driver.navigate().to(" https://selenium.qabible.in/radio-button-demo.php");
		WebElement male=driver.findElement(By.xpath("//input[@id='inlineRadio1'] "));
		male.click();
          boolean variable=male.isEnabled();
          System.out.println(variable);

	}
	public void isdisplayed()
	{
		driver.navigate().to(" https://selenium.qabible.in/radio-button-demo.php");
		WebElement male=driver.findElement(By.xpath("//input[@id='inlineRadio1'] "));
          boolean variable=male.isDisplayed();
          System.out.println(variable);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Radio obj=new Radio();
		obj.initializeBrowser();
		//obj.click();
		//obj.isselected();
		//obj.isdisplayed();
		obj.isenabled();

	}

}
