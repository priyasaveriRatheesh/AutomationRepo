package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testscript.Base;

public class Dropdown extends Base {
	public void index()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement selectcolor=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(selectcolor);
		select.selectByIndex(3);
	}
	public void value()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement value=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(value);
		select.selectByValue("Yellow");
	}
	
	public void visibletext()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement text=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(text);
		select.selectByVisibleText("Red");

	}

	public static void main(String[] args)
	{
		
		// TODO Auto-generated method stub
		Dropdown obj=new Dropdown();
		obj.initializeBrowser();
	  obj.index();
		obj.value();
		//obj.visibletext();
		//obj.driverQuitandClose();
	}

}
