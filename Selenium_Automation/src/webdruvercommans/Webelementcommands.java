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
driver.findElement(By.xpath("//div[@id=\"login-email-phone\"]//input")).sendKeys("shaikkalesha0545@gmail.com");
driver.findElement(By.id("login-submit3")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@id=\"enter-otp-phone-container\"]//input")).sendKeys("9535299295");
driver.findElement(By.id("login-submit1")).click();
}
}
