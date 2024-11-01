package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Alerthandling extends Base{
	public void simplealert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");//navigate
		WebElement alertelement=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));//inspect
		alertelement.click();//click
		String alerttext=driver.switchTo().alert().getText();
		System.out.println(alerttext);
		driver.switchTo().alert().accept();//to switch to popup alert because we cant direct inspect since this is not an html element 
		
	}
	public void confirmationalert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement confirmationelement=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		confirmationelement.click();
		String alerttext=driver.switchTo().alert().getText();
		System.out.println(alerttext);
		driver.switchTo().alert().accept(); 
		//driver.switchTo().alert().dismiss();
		
	}

public void promptalert()
{
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement promptelement=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
	promptelement.click();
	String alerttext=driver.switchTo().alert().getText();
	System.out.println(alerttext);
	driver.switchTo().alert().sendKeys("priya");
	driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alerthandling alerthandlingobj=new Alerthandling();
		alerthandlingobj.initializeBrowser();
		//alerthandlingobj.simplealert();
		alerthandlingobj.confirmationalert();
		//alerthandlingobj.promptalert();
		//alerthandlingobj.driverQuitandClose();
	}

}
