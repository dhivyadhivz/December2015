package week1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 2) Close all the frames other than center -
 http://layout.jquery-dev.com/demos/iframe_local.html
 
// Hint: find out how many frames are available and which close me are inside the frame
// Hint:switchTo().frame()
// Hint:outside the frame, do not have to switchTo

		 */
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\MyWorkspace\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElementById("lst-ib").sendKeys("Dhivya");
		
		driver.findElementByClassName("lsb").click();
		Thread.sleep(5000);

		
		List<WebElement> allNames = driver.findElementsByTagName("a");
 		for (WebElement webElement : allNames) {
			//System.out.println(webElement.getText());
			String text = webElement.getText().toLowerCase();
			if(text.contains("dhivya")){
			System.out.println(text);
			}
		}
		
		}
}


