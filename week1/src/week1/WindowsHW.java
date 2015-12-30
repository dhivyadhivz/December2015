package week1;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowsHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stu2) Close all the frames other than center -

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\MyWorkspace\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.crystalcruises.com");
		String parentWindowHandle = driver.getWindowHandle();
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String windowHandle : allWindowHandles) {
			driver.switchTo().window(windowHandle);
		}
		driver.findElementByLinkText("click here").click();
		
		Set<String> allWndHandles = driver.getWindowHandles();
		for (String wndHandle : allWndHandles) {
			driver.switchTo().window(wndHandle);
		}
		Select dropdown = new Select(driver.findElementByClassName("goog-te-combo"));
		dropdown.selectByValue("ta");
		
		// Run configuration ->Common tab -> Other radio button -> UTF 8 -> Click Apply -> Click Run
	String text = driver.findElementByXPath("//*[@id='mainBody']/div[1]/div[2]").getText();
	System.out.println(text);
		
		// not getting tamil text?
	}

}
