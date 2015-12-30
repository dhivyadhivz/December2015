package week1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenTapsLoginUsingWebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\MyWorkspace\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://demo1.opentaps.org/");
		 driver.findElementById("username").sendKeys("DemoSalesManager");
		 driver.findElementById("password").clear();
		 driver.findElementById("password").sendKeys("crmsfa");
		 driver.findElementByClassName("decorativeSubmit").click();
		 String text = driver.findElementByXPath("//*[@id='form']/br[1]").getText();
		 System.out.println(text);
		 /*if (text.contains("Demo Sales Manager")) {
		 System.out.println("Verified");
		 } else {
		 System.out.println("Failed");
		 }
		*/
		
	}
}
