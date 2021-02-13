import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingToolTip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Program Files\\\\\\\\Google\\\\\\\\Chrome\\\\\\\\Application\\\\\\\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    driver.get("https://www.naukri.com/");
		   WebElement Notification = driver.findElement(By.xpath("//div[@class ='topIcon notify']"));
		  String bellicon = Notification.getAttribute("class");
		  
		  if(bellicon.equalsIgnoreCase("topIcon notify")) {
		   
			  System.out.println("Bell icon matching expected result");
		  }
		  else {
		  
			  System.out.println("Bell Icon is not matching to expected value");
		  }
		  Actions act = new Actions(driver);
		  act.moveToElement(Notification).perform();
	}
	
}
