package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Radiobuttonpractis  extends Base{
	
	public void radiobutton()
	{
		/*driver.navigate().to(" https://selenium.qabible.in/radio-button-demo.php");
		WebElement male=driver.findElement(By.xpath("//input[@id='inlineRadio1'] "));
		male.click();
		WebElement showvalue=driver.findElement(By.xpath("//button[@id='button-one']"));
		showvalue.click();*/
		
		driver.navigate().to(" https://selenium.qabible.in/radio-button-demo.php");
		WebElement malenotclick=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		malenotclick.click();
		boolean malenotenable=malenotclick.isEnabled();
		System.out.println(malenotenable);
		WebElement showvaluenotenable=driver.findElement(By.xpath("//button[@id='button-one']"));
		showvaluenotenable.click();
		/*driver.navigate().to(" https://selenium.qabible.in/radio-button-demo.php");
		WebElement maleclick=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		maleclick.click();
		boolean maleenable=maleclick.isEnabled();
		System.out.println(maleenable);
		WebElement showvaluenotenable=driver.findElement(By.xpath("//button[@id='button-one']"));
		showvaluenotenable.click();*/
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Radiobuttonpractis obj=new Radiobuttonpractis();
		obj.initializeBrowser();
		obj.radiobutton();
		
	}

}
