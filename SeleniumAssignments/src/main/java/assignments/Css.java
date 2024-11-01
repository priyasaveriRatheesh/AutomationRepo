package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Css extends Base {
	public void tagid()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement element=driver.findElement(By.cssSelector(" input#single-input-field"));
		element.sendKeys("priya");
		WebElement element1=driver.findElement(By.cssSelector(" button#button-one"));
element1.click();
	}
	public void tagclass()
	
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement element=driver.findElement(By.cssSelector("input.form-control "));
		element.sendKeys("priya");
		WebElement element1=driver.findElement(By.cssSelector("button#button-one"));
element1.click();
	
	}
	public void tagclassattribute()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement element=driver.findElement(By.cssSelector("input.form-control[placeholder='Message']"));
		element.sendKeys("priya");
		WebElement element1=driver.findElement(By.cssSelector("button#button-one"));
        element1.click();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Css obj=new Css();
		obj.initializeBrowser();
		//obj.tagid();
		//obj.tagclass();
		obj.tagclassattribute();
	}

}
