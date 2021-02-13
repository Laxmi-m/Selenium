import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnhandledAlertException {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Program Files\\\\\\\\Google\\\\\\\\Chrome\\\\\\\\Application\\\\\\\\chromedriver.exe");
	
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("https://demo.actitime.com/login.do");
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
  
    driver.findElement(By.id("loginButton")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("//a[@class='content tasks']")).click();
    driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
    driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
    driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("Shriyu");
    driver.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
    
    driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[5]")).click();
    // out put is unhandledalertException. it happens when u don't handle the pop-ups
}

}
