package testscript;

public class Navigationcommands extends Base {
	
	public void NavigationCommands()
	{
		driver.navigate().to("https://www.amazon.in/");// to load a new url
	    driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Navigationcommands navigationcommands=new Navigationcommands();
		navigationcommands.initializeBrowser();
		navigationcommands.NavigationCommands();
		navigationcommands.driverQuitandClose();
		
	}

}
