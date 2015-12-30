package week3;

import java.util.Set;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.WebElementHandler;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\MyWorkspace\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/jqueryui/menu");
		Thread.sleep(20000);
		WebElement enable = driver.findElement(By.xpath("//*[@id='ui-id-2']"));
		WebElement downloads = driver.findElement(By.xpath("//*[@id='ui-id-4']"));
		WebElement pdf = driver.findElement(By.xpath("//*[@id='ui-id-6']"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(enable).moveToElement(downloads).moveToElement(pdf).click().build().perform();
	// need to check the verification part
		
		builder.release(enable).build().perform(); 
		builder.contextClick(enable).sendKeys(Keys.DOWN).click().build().perform();
		Set<String> wndHandle = driver.getWindowHandles();
		System.out.println("No of windows opened"+wndHandle.size());
	}
}


