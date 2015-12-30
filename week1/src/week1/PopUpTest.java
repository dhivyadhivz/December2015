package week1;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\MyWorkspace\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Multi-PopUp Test #2")).click();
		String windowHandle = driver.getWindowHandle();
		String title = driver.getTitle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String wndHandle : windowHandles) {
			if (!wndHandle.equals(windowHandle)) {
				driver.switchTo().window(wndHandle);
				driver.close();
			}
		}
	System.out.println("Title of parent window" +title);
	
	}
}


