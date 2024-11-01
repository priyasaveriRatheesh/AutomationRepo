package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Radiobutton extends Base {
	public void click()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement female=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		female.click();
		WebElement showvalue=driver.findElement(By.id("button-one"));
		showvalue.click();
		}
		
	public void isselected()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement female=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		female.click();
		boolean femalevariable=female.isSelected();
		System.out.println(femalevariable);
		WebElement showvalue=driver.findElement(By.id("button-one"));
		showvalue.click();
		
	}
	public void isenabled()//only true condition
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement female=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		female.click();
		boolean femalevariabe1=female.isEnabled(); 
		System.out.println(femalevariabe1);
		WebElement showvalue=driver.findElement(By.id("button-one"));
		showvalue.click(); 
			
		}
			
		public void isdisplayed()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement female=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		female.click();// always true value?
		boolean femalevar2=female.isDisplayed();
		System.out.println(femalevar2);
	
		}
	
	public void homework()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement female=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		//female.click();
		boolean femalevariable=female.isSelected();
		if(femalevariable==true)
		{
			System.out.println("female button is already selected");
		}
		else
		{
			female.click();
			System.out.println("female button is not selected so click to select it");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Radiobutton radioobj=new Radiobutton();
		radioobj.initializeBrowser();
		//radioobj.click();
		//radioobj.isselected();
		//radioobj.isenabled();
		//radioobj.isdisplayed();
		radioobj.homework();
		//radioobj.driverQuitandClose();


	}
	

}
