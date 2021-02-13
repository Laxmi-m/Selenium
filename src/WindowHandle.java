import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// ALpa numeric string value will be always unique
public class WindowHandle {
	public static void main(String[] args) throws InterruptedException, AWTException {
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Program Files\\\\\\\\Google\\\\\\\\Chrome\\\\\\\\Application\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		

}
}