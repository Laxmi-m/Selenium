import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Program Files\\\\\\\\Google\\\\\\\\Chrome\\\\\\\\Application\\\\\\\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://naukri.com");
		    driver.findElement(By.id("wdgt-file-upload")).click();
		    
		    StringSelection file = new StringSelection("\"C:\\Users\\dhana\\Documents\\Profile\\Preeta_profile.txt\"");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		     
		    Robot r = new Robot();// created an object to perform keyboard action
		    Thread.sleep(3000);
		    
		    r.keyPress(KeyEvent.VK_CONTROL);
		    r.keyPress(KeyEvent.VK_V);
		    Thread.sleep(3000);
		    r.keyPress(KeyEvent.VK_TAB);
		    Thread.sleep(3000);
		    r.keyPress(KeyEvent.VK_TAB);
		    Thread.sleep(3000);
		    r.keyPress(KeyEvent.VK_TAB);
		    
		    
		    
	}

}
