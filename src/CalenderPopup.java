import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Program Files\\\\\\\\Google\\\\\\\\Chrome\\\\\\\\Application\\\\\\\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    driver.get("https://www.aa.com/homePage.do");
		    driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
		    driver.findElement(By.xpath("(//a[.='22'])[1]")).click();
		    driver.findElement(By.xpath("(//a[.='20'])[1]")).click();
		    
		    
		    
		    driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
		    for(int m =0; m<=4; m++) {
		    	
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//a[@title='Next']")).click();
		    }
		    driver.findElement(By.xpath("(//a[.='22'])[2]")).click();
	}
}