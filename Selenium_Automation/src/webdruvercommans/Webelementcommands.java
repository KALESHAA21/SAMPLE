package webdruvercommans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webelementcommands 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("http://www.vedantu.com");
driver.findElement(By.xpath("//button[contains(@class,'button button_button__2GW-o button--small button_buttonSmall__3aGZA     button--secondary button_buttonSecondary__10WYP Header_signInButton__2iDLl')]"))
.click();
Thread.sleep(2000);
}
}
