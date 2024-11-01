package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Table extends Base {
	public void head()
	{driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement tab=driver.findElement(By.xpath("//table[@id='dtBasicExample']/thead/tr[1]"));
String var=	tab.getText();
System.out.println(var);
		}
	
	public void tablefull()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tab=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		String var=tab.getText();
		System.out.println(var);
	}
public void row()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement tab=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]"));
	String var =tab.getText();
	System.out.println(var);

	
}
public void cell()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement tab=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[2]"));
	String var =tab.getText();
	System.out.println(var);

}
public void column()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	List<WebElement> tab=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
	for(WebElement i:tab)
	{
	String  s=i.getText();
	System.out.println(s);
		//System.out.println(i.getText());
	}
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Table obj=new Table();
	obj.initializeBrowser();
	//obj.tablefull();
	//obj.head();
	//obj.row();
	//obj.cell();
	obj.column();

	}

}
