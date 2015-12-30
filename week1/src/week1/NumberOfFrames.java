package week1;

import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 1) Find the number of frames within the application:
			http://layout.jquery-dev.com/demos/iframes_many.html
		 */
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\MyWorkspace\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		
		Thread.sleep(30000);
		int count = driver.findElementsByTagName("iframe").size();
		System.out.println("number of frames:"+count);
	}

}
