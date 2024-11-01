package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base {
	
		public void XPATHlocator()//syntax:
		//tagname[@attribute='value']; // represent current node,@attribute value
	{
			WebElement element=driver.findElement(By.xpath("//button[@id='button-one'] "));
			WebElement element1=driver.findElement(By.xpath("//input[@id='value-a']"));
			WebElement element2=driver.findElement(By.xpath("//button[@id='button-two']"));
			WebElement element3=driver.findElement(By.xpath("//input[@id='value-b'] "));
			WebElement element4=driver.findElement(By.xpath("//input[@id='single-input-field']"));

	}

		public void contains()
		//syntax://"tag[contains(@attribute,'value')]"
		{
			WebElement element=driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
			//WebElement element=driver.findElement(By.xpath("//input[contains(@id,'input-field')]"));//attribute value can given from middle also
			WebElement element1=driver.findElement(By.xpath(" //button[contains@(id,'button-one')]"));
			WebElement element2=driver.findElement(By.xpath("//button[contains(@id,'button-two')] "));
	
		}
		
		public void startswith()
		{
			//syntax://tag[starts-with(@attribute,'value')]
			WebElement element=driver.findElement(By.xpath("//input[starts-with(@id,'single-input-field')]"));
			//WebElement element=driver.findElement(By.xpath("//input[starts-with(@id,'single-input-')]"));//can give the attribute value from middle but must give the starting attribute value
			WebElement element1=driver.findElement(By.xpath("//button[starts-with(@id,'button-one')]"));
			WebElement element2=driver.findElement(By.xpath("//input[starts-with(@id,'value-a')]"));

		}
		public void text()
		{
			//syntax: //tag[text()='text']
			WebElement element=driver.findElement(By.xpath("//button[text()='Show Message']"));
			WebElement element2=driver.findElement(By.xpath("//label[text()='Enter Message']"));
			WebElement element3=driver.findElement(By.xpath("//button[text()='Get Total']"));
			WebElement element4=driver.findElement(By.xpath("//label[text()='Enter value A']"));

		}
		
		public void and()
		{
			//tag[@attribute='value'and @attribute='value'];
			WebElement element=driver.findElement(By.xpath("//button[@type='button' and @id='button-one']"));
			WebElement element1=driver.findElement(By.xpath("//input[@id='value-a' and @type='text']"));
			WebElement element2=driver.findElement(By.xpath("//input[@id='value-a' and @id='value-a']"));

		}
		public void or()
		{
			//tag[@attribute='value' or @attribute='value']
			WebElement element=driver.findElement(By.xpath("//button[@type='button' or @ class='navbar-toggler']"));
			WebElement element1=driver.findElement(By.xpath("//button[@id='button-one' or @type='button'] "));
			WebElement element2=driver.findElement(By.xpath(" //button[@id='button-two' or @type='button']"));

		}
	public static void main(String[] args) {
	
		
		Xpath xpathobj=new Xpath();
		xpathobj.initializeBrowser();
		xpathobj.XPATHlocator();
		xpathobj.contains();
		xpathobj.startswith();
		xpathobj.text();
		xpathobj.and();
		xpathobj.or();
		xpathobj.driverQuitandClose();
		

	}

}
