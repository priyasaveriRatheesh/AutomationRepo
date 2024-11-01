package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testscript.Base;

public class Dropdwn extends Base{
	public void index()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement check=driver.findElement(By.xpath(" //select[@id='single-input-field']"));
		Select selectobj=new Select(check);
		selectobj.selectByIndex(1);
		
	}
	public void value()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement check=driver.findElement(By.xpath(" //select[@id='single-input-field']"));
		Select selectobj=new Select(check);
        selectobj.selectByValue("Yellow");
	}
public void text()
{
	driver.navigate().to("https://selenium.qabible.in/select-input.php");
	WebElement check=driver.findElement(By.xpath("//select[@id='single-input-field']"));
	Select selectobj=new Select(check);
        selectobj.selectByVisibleText("Green");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dropdwn obj=new Dropdwn();
		obj.initializeBrowser();
		//obj.index();
		//obj.value();
		obj.text();
	}

}
