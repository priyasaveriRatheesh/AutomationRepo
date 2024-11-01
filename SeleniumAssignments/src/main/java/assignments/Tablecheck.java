package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Tablecheck extends Base {
	public void table()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> table=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		String one="Colleen Hurst";
		for(WebElement variable:table)
		{
			/*String two= variable.getText();
			if(two.equals(one))
			{
				System.out.println(two);*/
	if(variable.getText().equals(one))
	{
		System.out.println(variable.getText());
	}
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tablecheck obj=new Tablecheck();
		obj.initializeBrowser();
		obj.table();
	}

}
