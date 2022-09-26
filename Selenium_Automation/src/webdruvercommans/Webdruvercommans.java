package webdruvercommans;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdruvercommans 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//get method will open the new browser and opens the URL in the specified instance
	driver.get("https://www.vedantu.com");
	//getTitle method will get the title of the current page which is opened
	String titile=driver.getTitle();
	System.out.println("title of the cureent page:"+titile);
	//getCurrenturl method will get the current page url which is opened
	String currenturl=driver.getCurrentUrl();
	System.out.println("current URL of the webpage:"+currenturl);
	//getPageSource will get the source code of the webpage
	//String pagesource=driver.getPageSource();
	//System.out.println("current page source:"+pagesource);
	String parentwindow = driver.getWindowHandle();
	System.out.println(parentwindow);
	Set<String> allwindows = driver.getWindowHandles();
	for(int i=0;i<allwindows.size();i++)
	{
		System.out.println(allwindows);
	}
	 Class<? extends WebDriver> st = driver.getClass();
	System.out.println(st);
	}

}
