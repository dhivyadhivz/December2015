package week2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\MyWorkspace\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://http://the-internet.herokuapp.com/hovers");
		Thread.sleep(30000);
		
		WebElement user1 = driver.findElementByXPath("//*[@id='content']/div/div[1]/img");
		Actions builder = new Actions(driver);
		builder.moveToElement(u)
	}
}

}
