package assignments;

import testscript.Base;

public class Brwser extends Base {
	public void broser()
	{
	String tit=driver.getTitle();
	System.out.println(tit);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String source=driver.getPageSource();
	System.out.println(source);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brwser obj=new Brwser();
		obj.initializeBrowser();
		obj.broser();
	}

}
