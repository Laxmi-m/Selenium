import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriChildBrowser {
	public static void main(String[] args) throws InterruptedException, AWTException {
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Program Files\\\\\\\\Google\\\\\\\\Chrome\\\\\\\\Application\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Set<String> window = driver.getWindowHandles();
		System.out.println(window.size());
		//ArrayList<String> al = new ArrayList<>();// empty ArrayList
		//ArrayList<String> al = new ArrayList<>(window);// method 1
	//System.out.println(al.size());
		ArrayList<String> al = new ArrayList<>(window);
		al.addAll(window);
		System.out.println(al.size());
		
		driver.switchTo().window(al.get(1));// control is present in "0" that is naukri so we are switching to L&T. so value we are giving here is "1"
		//System.out.println(driver.getTitle());// window name(LNT)
		driver.manage().window().maximize();
		driver.close();
		// after closing window ypu can not perform any program, otherwise u get no such window exception//
		driver.switchTo().window(al.get(0));
		System.out.println(driver.getTitle());
		

}
}