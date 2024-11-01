package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Tablehandling  extends Base{
	public void tableprint()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		String variable=table.getText();
		System.out.println(variable);
		//System.out.println(table.getText());another method instead of direct sout
	}
	public void rowprint()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1] "));
	System.out.println(row.getText());
	}

	public void cellprint()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement column=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[1] "));
		System.out.println(column.getText());
		
	}
	
	public void assignmentrow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row4=driver.findElement(By.xpath(" //table[@id='dtBasicExample']/tbody/tr[4]"));
		System.out.println(row4.getText());
		
	}
	public void assignmentcell()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row5column3=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[5]//td[3] "));
		System.out.println(row5column3.getText());
		
	}
	public void heading()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement heading=driver.findElement(By.xpath("//table[@id='dtBasicExample']/thead/tr[1]"));
		System.out.println(heading.getText());
		
	}
	
	public void columnprint()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> printcolumn =driver.findElements(By.xpath(" //table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement i:printcolumn)
		{
		System.out.println(i.getText());
		}
	}
	//class assignment
	public void classassignment()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> printcolumn =driver.findElements(By.xpath(" //table[@id='dtBasicExample']/tbody/tr/td[1]"));
		String input="Ashton Cox";
		for(WebElement i:printcolumn)
		{
			String input2=i.getText();
			if(input.equals(input2))
				{
					System.out.println(i.getText());
					System.out.println("both are same");
					
				}
			/*	{
				if(i.getText().equals(input))
			{
		System.out.println(i.getText());
		System.out.println("both are same");
				}*/
				}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Tablehandling tableobj=new Tablehandling();
		tableobj.initializeBrowser();
		//tableobj.tableprint();
		//tableobj.rowprint();
	    // tableobj.cellprint();
		//tableobj.assignmentrow();
		//tableobj.assignmentcell();
		//tableobj.columnprint();
		tableobj.classassignment();
		//tableobj.heading();
		//tableobj.driverQuitandClose();

	}

}
