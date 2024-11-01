package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelectror extends Base
{
	 public void tagandid()//tag#idvalue
	 {
		WebElement elementtagid= driver.findElement(By.cssSelector("button#button-one")); 
		WebElement elementtagid1=driver.findElement(By.cssSelector("input#value-a"));
		WebElement elementtagid2=driver.findElement(By.cssSelector("input#value-b"));
		WebElement elementtagid3=driver.findElement(By.cssSelector("button#button-two"));
     	WebElement elementtagid4=driver.findElement(By.cssSelector("input#single-input-field"));
		
	 }
	public void tagandclass()//tag.classvalue
	{
		WebElement tagandclass=driver.findElement(By.cssSelector("span.navbar-toggler-icon"));
		WebElement tagandclass1=driver.findElement(By.cssSelector("button.navbar-toggler"));
		WebElement tagandclass2=driver.findElement(By.cssSelector("div.top-logo"));


	}
public void tagandattribute()//tag[attribute='value']
{
	WebElement tagandtribute=driver.findElement(By.cssSelector("button[id='button-one'] "));
	WebElement tagandtribute1=driver.findElement(By.cssSelector("div[id='collapsibleNavbar']"));
	WebElement tagandtribute2=driver.findElement(By.cssSelector("div[class='collapse navbar-collapse']"));


}

public void tagclassandattribute()//tag.classname[attribute='value'];
{
	WebElement tagclassandtribute=driver.findElement(By.cssSelector("input.form-control[id='value-a']"));
	WebElement tagclassandtribute1=driver.findElement(By.cssSelector("input.form-control[id='value-b'] "));
	WebElement tagclassandtribute2=driver.findElement(By.cssSelector(" button.navbar-toggler[type='button']"));

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CssSelectror cssselector=new CssSelectror();
		cssselector.initializeBrowser();
		cssselector.tagandid();
		cssselector.tagandclass();
		cssselector.tagandattribute();
		cssselector.tagclassandattribute();
		cssselector.driverQuitandClose(); 
		
	}

}
