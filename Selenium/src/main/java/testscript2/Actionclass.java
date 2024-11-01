package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testscript.Base;

public class Actionclass  extends Base{
	public void doubleclick()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag1 =driver.findElement(By.xpath(" //span[text()='Draggable n°1']"));
		WebElement drop =driver.findElement(By.xpath(" //div[@id='mydropzone']"));
         Actions actions=new Actions(driver);
         actions.doubleClick(drag1).build().perform();
	}
	public void mousehover()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag1 =driver.findElement(By.xpath(" //span[text()='Draggable n°1']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(drag1).build().perform();
	}
	public void draganddrop()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag1 =driver.findElement(By.xpath(" //span[text()='Draggable n°1']"));
		WebElement drop =driver.findElement(By.xpath(" //div[@id='mydropzone']"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(drag1, drop).build().perform();
        
	}
	public void rightclick()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag1 =driver.findElement(By.xpath(" //span[text()='Draggable n°1']"));
        Actions actions=new Actions(driver);
        actions.contextClick(drag1).build().perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actionclass actionclassobj=new Actionclass();
		actionclassobj.initializeBrowser();
		//actionclassobj.doubleclick();
		//actionclassobj.mousehover();
		actionclassobj.draganddrop();
		actionclassobj.rightclick();
		//actionclassobj.driverQuitandClose();
		
	}

}
