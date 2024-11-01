package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Frames extends Base{
	public void farmes()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement iframe =driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iframe);
		WebElement jmetr =driver.findElement(By.xpath("	//img[@src='Jmeter720.png']"));
		jmetr.click();
        
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frames framesobj=new Frames();
		framesobj.initializeBrowser();
		framesobj.farmes();
		//framesobj.driverQuitandClose();
	}

}
