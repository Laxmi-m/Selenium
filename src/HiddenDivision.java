import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Program Files\\\\\\\\Google\\\\\\\\Chrome\\\\\\\\Application\\\\\\\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.skillrary.com/");
	    
	    driver.findElement(By.xpath("(//img[@src='https://www.skillrary.com/assets/skillrary/images/google.png'])[2]")).click();
	    
	}

}
