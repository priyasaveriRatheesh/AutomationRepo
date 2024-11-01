package assignments;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testscript.Base;

public class Actionclass extends Base {
	public void doubleclc()
	{
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement contact=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	//WebElement drop=driver.findElement(By.xpath("//div[@id='mydropzone']"));
    Actions obj=new Actions(driver);
    obj.doubleClick(contact).build().perform();
		
	}
public void mousehover()
{
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement contact=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
    Actions obj=new Actions(driver);
    obj.moveToElement(contact).build().perform();
	
}
public void draganddrop()
{
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement contact=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	WebElement drop=driver.findElement(By.xpath("//div[@id='mydropzone']"));
    Actions obj=new Actions(driver);
    obj.dragAndDrop(contact, drop).build().perform();
   
}
public void rightclick()
{
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement contact=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
    Actions obj=new Actions(driver);
    obj.contextClick(contact).build().perform();
    
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actionclass obj=new Actionclass();
		obj.initializeBrowser();
		//obj.doubleclc();
		//obj.mousehover();
		//obj.draganddrop();
		obj.rightclick();
				
	}

}
