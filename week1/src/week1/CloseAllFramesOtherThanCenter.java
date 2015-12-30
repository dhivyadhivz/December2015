package week1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllFramesOtherThanCenter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * 2) Close all the frames other than center -
 http://layout.jquery-dev.com/demos/iframe_local.html
 
// Hint: find out how many frames are available and which close me are inside the frame
// Hint:switchTo().frame()
// Hint:outside the frame, do not have to switchTo
		 */
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\MyWorkspace\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		Thread.sleep(30000);
		int count = driver.findElementsByTagName("iframe").size();
		System.out.println("Number of frames"+count);
		
		List<WebElement> btn = driver.findElements(By.xpath("//button[text()='Close Me']"));
		System.out.println("number of buttons"+btn.size());
		driver.findElement(By.xpath("/html/body/div[2]/p/button")).click();
		driver.findElement(By.xpath("/html/body/div[3]/p/button")).click();
		
		driver.switchTo().frame("childIframe");
		
		driver.findElement(By.xpath("/html/body/div[2]/p/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/p[1]/button")).click();
		
		
	}

}
