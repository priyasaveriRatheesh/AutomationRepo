package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Frame  extends Base{
	public void frames()
	{
		driver.navigate().to(" https://demo.guru99.com/test/guru99home/");
		WebElement frme=driver.findElement(By.xpath(" //iframe[@id='a077aa5e']"));
		driver.switchTo().frame(frme);
		WebElement name=driver.findElement(By.xpath(" //img[@src='Jmeter720.png']"));
		name.click();
		
	}

	public static void main(String[] args) {
		
		Frame obj=new Frame();
		obj.initializeBrowser();
		obj.frames();
	}

}
