package webdruvercommans;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookFreeDemo 
{
public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://www.vedantu.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys("KALESHA SHAIK");
	driver.findElement(By.xpath("//input[@placeholder='Enter mobile number (India only)']")).sendKeys("9535299296");
	WebElement dropdown = driver.findElement(By.xpath("//div[contains(@class,'BookDemoForm_dropdownDisplay')]"));
	dropdown.click();
	List<WebElement> list = driver.findElements(By.xpath("//label[contains(@class,'dropdown_checkboxLabel')]"));
	for(int i=0;i<=list.size()-1;i++)
	{
		if(list.get(i).getText().equals("LKG"))
		{
			list.get(i).click();
			break;
		}
	}
	driver.findElement(By.xpath("//button[.='Book a free demo']")).click();
	}
}
