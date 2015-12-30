package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OptionHW3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\MyWorkspace\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		Thread.sleep(10000);
		
		WebElement f1 = driver.findElement(By.className("frame-left"));
		driver.switchTo().frame(f1);
		String text1 = driver.findElement(By.className("frame-left")).getText();
		System.out.println(text1);
		driver.switchTo().defaultContent();
		
		WebElement f2 = driver.findElement(By.className("frame-middle"));
		driver.switchTo().frame(f2);
		String text2 = driver.findElement(By.className("frame-middle")).getText();
		System.out.println(text2);
		driver.switchTo().defaultContent();
		
		
		WebElement f3 = driver.findElement(By.className("frame-right"));
		driver.switchTo().frame(f3);
		String text3 = driver.findElement(By.className("frame-right")).getText();
		System.out.println(text3);
		driver.switchTo().defaultContent();
		
		
		WebElement f4 = driver.findElement(By.className("frame-bottom"));
		driver.switchTo().frame(f4);
		String text4 = driver.findElement(By.className("frame-bottom")).getText();
		System.out.println(text4);
	}
}


