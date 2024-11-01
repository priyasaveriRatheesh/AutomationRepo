package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Xpathprcts extends Base{
	public void xpath()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement element=driver.findElement(By.xpath("//input[@placeholder='Message']"));
		element.sendKeys("priya");
		WebElement element1=driver.findElement(By.xpath(" //button[@id='button-one']"));
        element1.click();
	
	}
public void contains()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement element=driver.findElement(By.xpath("//input[contains@placeholder='Message']"));
	element.sendKeys("priya");
	WebElement element1=driver.findElement(By.cssSelector(" //button[contains@id='button-one']"));
    element1.click();

}
public void startswith()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement element=driver.findElement(By.cssSelector("//input[@placeholder='Mess']"));
	element.sendKeys("priya");
	WebElement element1=driver.findElement(By.cssSelector("button#button-o"));
    element1.click();

}
public void text()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement element=driver.findElement(By.cssSelector("input.form-control[placeholder='Message']"));
	element.sendKeys("priya");
	WebElement element1=driver.findElement(By.cssSelector("button#button-one"));
    element1.click();

}
public void and()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement element=driver.findElement(By.cssSelector("input.form-control[placeholder='Message']"));
	element.sendKeys("priya");
	WebElement element1=driver.findElement(By.cssSelector("button#button-one"));
    element1.click();

}
public void or()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement element=driver.findElement(By.cssSelector("input.form-control[placeholder='Message']"));
	element.sendKeys("priya");
	WebElement element1=driver.findElement(By.cssSelector("button#button-one"));
    element1.click();

}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Xpathprcts obj=new Xpathprcts();
	obj.initializeBrowser();
	//obj.xpath();
	obj.contains();
	//obj.startswith();
	//obj.text();
	//obj.and();
	//obj.or();
	}

}
