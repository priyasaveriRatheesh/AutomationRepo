package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Alert extends Base {

	public void simple()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		
		WebElement alert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		alert.click();
		String alertvar=driver.switchTo().alert().getText();
		System.out.println(alertvar);
		driver.switchTo().alert().accept();
		
	}
	public void confirmtion()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		alert.click();
	String var=	driver.switchTo().alert().getText();
	System.out.println(var);
	driver.switchTo().alert().dismiss();
	driver.switchTo().alert().accept();
			
	}
	public void prompt()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert=driver.findElement(By.xpath(" //button[@onclick='jsPrompt()']"));
		alert.click();
		String vari=driver.switchTo().alert().getText();
		System.out.println(vari);
		driver.switchTo().alert().sendKeys("priya");
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alert obj=new Alert();
		obj.initializeBrowser();
		//obj.simple();
		//obj.confirmtion();
		obj.prompt();
		//		
	}

}
