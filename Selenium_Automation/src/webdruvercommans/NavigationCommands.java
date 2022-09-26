package webdruvercommans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http:/www.vedantu.com");
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(2000);
driver.navigate().forward();
WebElement e=driver.findElement(By.xpath("//div[contains(text(),'Courses for Kids')]"));
System.out.println(e.getText());
System.out.println(e.getLocation());
System.out.println(e.getRect().getHeight());
driver.findElement(By.xpath("//div[.='More']")).click();
System.out.println(driver.findElement(By.xpath("//h3[.='Our results']")).getText());
System.out.println(e.getAttribute("class"));
System.out.println(e.isDisplayed());
System.out.println(e.isEnabled());
System.out.println(e.getTagName());
System.out.println(e.getAriaRole());
}
}
